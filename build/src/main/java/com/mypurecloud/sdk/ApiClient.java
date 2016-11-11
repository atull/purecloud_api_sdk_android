package com.mypurecloud.sdk;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.oltu.oauth2.client.request.OAuthClientRequest.AuthenticationRequestBuilder;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest.TokenRequestBuilder;

import retrofit2.Converter;
import retrofit2.Retrofit;

import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.*;

import com.mypurecloud.sdk.auth.HttpBasicAuth;
import com.mypurecloud.sdk.auth.ApiKeyAuth;
import com.mypurecloud.sdk.auth.OAuth;
import com.mypurecloud.sdk.auth.OAuth.AccessTokenListener;
import com.mypurecloud.sdk.auth.OAuthFlow;


public class ApiClient {

    private Map<String, Interceptor> apiAuthorizations;
    private OkHttpClient okClient;
    private String basePath = "https://api.mypurecloud.com";
    private String accessToken = "";
    private Retrofit.Builder adapterBuilder;

    public ApiClient() {
        apiAuthorizations = new LinkedHashMap<String, Interceptor>();
        createDefaultAdapter(accessToken);
    }

    public ApiClient(String[] authNames) {
        this();
        for(String authName : authNames) { 
            Interceptor auth;
            if (authName == "PureCloud Auth") { 
                auth = new OAuth(OAuthFlow.implicit, "https://auth.us-east-1.mypurecloud.com/authorize", "", "all");
            } else {
                throw new RuntimeException("auth name \"" + authName + "\" not found in available auth names");
            }
            addAuthorization(authName, auth);
        }
    }

    /**
     * Basic constructor for single auth name
     * @param authName
     */
    public ApiClient(String authName) {
        this(new String[]{authName});
    }

    /**
     * Helper constructor for single api key
     * @param authName
     * @param apiKey
     */
    public ApiClient(String authName, String apiKey) {
        this(authName);
        this.setApiKey(apiKey);
    }

    /**
     * Helper constructor for single basic auth or password oauth2
     * @param authName
     * @param username
     * @param password
     */
    public ApiClient(String authName, String username, String password) {
        this(authName);
        this.setCredentials(username,  password);
    }

    /**
     * Helper constructor for single password oauth2
     * @param authName
     * @param clientId
     * @param secret
     * @param username
     * @param password
     */
    public ApiClient(String authName, String clientId, String secret, String username, String password) {
        this(authName);
        this.getTokenEndPoint()
                .setClientId(clientId)
                .setClientSecret(secret)
                .setUsername(username)
                .setPassword(password);
    }

    public String getBasePath() {
        return basePath;
    }

    public ApiClient setBasePath(String basePath) {
       this.basePath = basePath;
       return this;
    }
   public void createDefaultAdapter(final String accessToken) {
        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
                .create();

        okClient = new OkHttpClient().newBuilder().addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request request = chain.request().newBuilder()
                        .addHeader("Authorization", "bearer " + accessToken).build();
                return chain.proceed(request);
        }
    }).build();

        String baseUrl = "https://api.mypurecloud.com";
        if(!basePath.endsWith("/"))
            basePath = basePath + "/";

        adapterBuilder = new Retrofit
                .Builder()
                .baseUrl(basePath)
                .client(okClient)
                
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonCustomConverterFactory.create(gson));
    }

    public <S> S createService(Class<S> serviceClass) {
        return adapterBuilder.build().create(serviceClass);

    }

    /**
     * Helper method to configure the first api key found
     * @param apiKey
     */
    private void setApiKey(String apiKey) {
        for(Interceptor apiAuthorization : apiAuthorizations.values()) {
            if (apiAuthorization instanceof ApiKeyAuth) {
                ApiKeyAuth keyAuth = (ApiKeyAuth) apiAuthorization;
                keyAuth.setApiKey(apiKey);
                return;
            }
        }
    }

    /**
     * Helper method to configure the username/password for basic auth or password oauth
     * @param username
     * @param password
     */
    private void setCredentials(String username, String password) {
        for(Interceptor apiAuthorization : apiAuthorizations.values()) {
            if (apiAuthorization instanceof HttpBasicAuth) {
                HttpBasicAuth basicAuth = (HttpBasicAuth) apiAuthorization;
                basicAuth.setCredentials(username, password);
                return;
            }
            if (apiAuthorization instanceof OAuth) {
                OAuth oauth = (OAuth) apiAuthorization;
                oauth.getTokenRequestBuilder().setUsername(username).setPassword(password);
                return;
            }
        }
    }

    /**
     * Helper method to configure the token endpoint of the first oauth found in the apiAuthorizations (there should be only one)
     * @return
     */
    public TokenRequestBuilder getTokenEndPoint() {
        for(Interceptor apiAuthorization : apiAuthorizations.values()) {
            if (apiAuthorization instanceof OAuth) {
                OAuth oauth = (OAuth) apiAuthorization;
                return oauth.getTokenRequestBuilder();
            }
        }
        return null;
    }

    /**
     * Helper method to configure authorization endpoint of the first oauth found in the apiAuthorizations (there should be only one)
     * @return
     */
    public AuthenticationRequestBuilder getAuthorizationEndPoint() {
        for(Interceptor apiAuthorization : apiAuthorizations.values()) {
            if (apiAuthorization instanceof OAuth) {
                OAuth oauth = (OAuth) apiAuthorization;
                return oauth.getAuthenticationRequestBuilder();
            }
        }
        return null;
    }

    /**
     * Helper method to pre-set the oauth access token of the first oauth found in the apiAuthorizations (there should be only one)
     * @param accessToken
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        createDefaultAdapter(accessToken);

        for(Interceptor apiAuthorization : apiAuthorizations.values()) {
            if (apiAuthorization instanceof OAuth) {
                OAuth oauth = (OAuth) apiAuthorization;
                oauth.setAccessToken(accessToken);
                return;
            }
        }
    }

    /**
     * Helper method to configure the oauth accessCode/implicit flow parameters
     * @param clientId
     * @param clientSecret
     * @param redirectURI
     */
    public void configureAuthorizationFlow(String clientId, String clientSecret, String redirectURI) {
        for(Interceptor apiAuthorization : apiAuthorizations.values()) {
            if (apiAuthorization instanceof OAuth) {
                OAuth oauth = (OAuth) apiAuthorization;
                oauth.getTokenRequestBuilder()
                        .setClientId(clientId)
                        .setClientSecret(clientSecret)
                        .setRedirectURI(redirectURI);
                oauth.getAuthenticationRequestBuilder()
                        .setClientId(clientId)
                        .setRedirectURI(redirectURI);
                return;
            }
        }
    }

    /**
     * Configures a listener which is notified when a new access token is received.
     * @param accessTokenListener
     */
    public void registerAccessTokenListener(AccessTokenListener accessTokenListener) {
        for(Interceptor apiAuthorization : apiAuthorizations.values()) {
            if (apiAuthorization instanceof OAuth) {
                OAuth oauth = (OAuth) apiAuthorization;
                oauth.registerAccessTokenListener(accessTokenListener);
                return;
            }
        }
    }

    /**
     * Adds an authorization to be used by the client
     * @param authName
     * @param authorization
     */
    public void addAuthorization(String authName, Interceptor authorization) {
        if (apiAuthorizations.containsKey(authName)) {
            throw new RuntimeException("auth name \"" + authName + "\" already in api authorizations");
        }
        apiAuthorizations.put(authName, authorization);
        okClient.interceptors().add(authorization);
    }

    public Map<String, Interceptor> getApiAuthorizations() {
        return apiAuthorizations;
    }

    public void setApiAuthorizations(Map<String, Interceptor> apiAuthorizations) {
        this.apiAuthorizations = apiAuthorizations;
    }

    public Retrofit.Builder getAdapterBuilder() {
        return adapterBuilder;
    }

    public void setAdapterBuilder(Retrofit.Builder adapterBuilder) {
        this.adapterBuilder = adapterBuilder;
    }

    public OkHttpClient getOkClient() {
        return okClient;
    }

    public void addAuthsToOkClient(OkHttpClient okClient) {
        for(Interceptor apiAuthorization : apiAuthorizations.values()) {
            okClient.interceptors().add(apiAuthorization);
        }
    }

    /**
     * Clones the okClient given in parameter, adds the auth interceptors and uses it to configure the Retrofit
     * @param okClient
     */
    public void configureFromOkclient(OkHttpClient okClient) {
        OkHttpClient clone = okClient.newBuilder().build();
        addAuthsToOkClient(clone);
        adapterBuilder.client(clone);
    }
}

/**
 * This wrapper is to take care of this case:
 * when the deserialization fails due to JsonParseException and the
 * expected type is String, then just return the body string.
 */
class GsonResponseBodyConverterToString<T> implements Converter<ResponseBody, T> {
	  private final Gson gson;
	  private final Type type;

	  GsonResponseBodyConverterToString(Gson gson, Type type) {
	    this.gson = gson;
	    this.type = type;
	  }

	  @Override public T convert(ResponseBody value) throws IOException {
	    String returned = value.string();
	    try {
	      return gson.fromJson(returned, type);
	    }
	    catch (JsonParseException e) {
                return (T) returned;
        }
	 }
}

class GsonCustomConverterFactory extends Converter.Factory
{
	public static GsonCustomConverterFactory create(Gson gson) {
	    return new GsonCustomConverterFactory(gson);
	  }

	  private final Gson gson;
	  private final GsonConverterFactory gsonConverterFactory;

	  private GsonCustomConverterFactory(Gson gson) {
	    if (gson == null) throw new NullPointerException("gson == null");
	    this.gson = gson;
	    this.gsonConverterFactory = GsonConverterFactory.create(gson);
	  }

    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
        if(type.equals(String.class))
            return new GsonResponseBodyConverterToString<Object>(gson, type);
        else
            return gsonConverterFactory.responseBodyConverter(type, annotations, retrofit);
    }

    @Override
    public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
            return gsonConverterFactory.requestBodyConverter(type, parameterAnnotations, methodAnnotations, retrofit);
    }
}
