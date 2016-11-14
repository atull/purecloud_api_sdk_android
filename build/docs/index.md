
# Title: PureCloud API SDK - Android
An Android library for the PureCloud Public API

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Install Using maven

Todo Process

## Generating the Purecloud Swagger Client Library
~~~
Steps :
1. Open the terminal (Navigate to project build folder)
2. Enter the command :  mvn clean package
3. After getting "BUILD SUCCESS" in the terminal then goto target folder and copy platform-android-client-1.0.0.jar in your local machine.
4. Include that jar as a module dependency in your android project application.
~~~

## Permissions needed in Android Test Application Manifest.xml file
~~~
    <uses-permission android:name="android.permission.INTERNET" />
~~~

## Dependency of gradle libraries to be included in the test application build.gradle file are as below 
~~~
    compile 'io.swagger:swagger-annotations:1.5.8'
    compile 'com.squareup.retrofit2:converter-gson:2.0.2'
    compile 'com.squareup.retrofit2:retrofit:2.0.2'
    compile 'com.squareup.retrofit2:converter-scalars:2.0.2'
    compile project(':platform-android-client-1.0.0')
~~~
Note : platform-android-client-1.0.0 is being added as a module dependency which is generated in above steps

## Using the Library

### Referencing the Library

Import the necessary components:

~~~
import com.google.gson.Gson;
import com.mypurecloud.sdk.ApiClient;
import com.mypurecloud.sdk.api.UsersApi;
import com.mypurecloud.sdk.model.UserMe;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import java.util.Arrays;
~~~

### Specifying the environment

If connecting to a PureCloud environment other than mypurecloud.com (e.g. api.inindca.com), set the new base path before constructing any API classes. The new base path should be the base path to the Platform API for your environment.

~~~
Configuration.getDefaultApiClient().setBasePath("https://api.inindca.com");
~~~

### Authenticating

The Java SDK does not currently contain helper methods to complete an OAuth flow. The consuming applicaiton must complete an OAuth flow to get an access token outside the scope of the SDK. Once an access token is obtained, it should be set on the SDK via `Configuration.getDefaultApiClient().setAccessToken(token)`. For more information about authenticating with OAuth, see the Developer Center article [Authorization](https://developer.mypurecloud.com/api/rest/authorization/index.html).

~~~
Configuration.getDefaultApiClient().setAccessToken("u8Jxb7j4JRooBIZZ0cqfd6KF7DRVqstsBnR2oqCaQj95E1PjgujIH0cfEhBXRfVGHXPhIGkfZZ4D5dk5w8COWg");

Note : Replace with your own generated access token else it will give status code 401, message = Unauthorized
~~~

### Making Requests in Android Application

There are two steps to making requests:

1. Instantiate one of the API classes in the io.swagger.client.api namespace
2. Invoke the methods on the API object

Example of calling getMe purecloud api information:

~~~

                ApiClient defaultClient = new ApiClient();
                defaultClient.setBasePath("https://api.inindca.com");//Replace with your base path default is "https://api.mypurecloud.com"
                defaultClient.setAccessToken("_-p_7VngeDSxnvA9t8P0Ul9U2ZTJlhS5_6T_f-aPn3pvuIj_pC1dpRypJWk5zefHpwS99-7RNgMeVFQJjHoN4A"); // Replace with your access token

                Call<UserMe> userMeCall = defaultClient.createService(UsersApi.class).getMe(Arrays.asList("presence"));

                userMeCall.enqueue(new Callback<UserMe>() {
                    @Override
                    public void onResponse(Call<UserMe> call, Response<UserMe> response) {
                        if (response.isSuccessful()) {
                            Gson gson = new Gson();
                            String json = gson.toJson(response.body());
                            responsetext.setText(json);
                            Log.d(Tag, json);
                            Log.d(Tag, response.body().toString());
                            Log.d(Tag, response.raw().toString());
                            Log.d(Tag, response.toString());
                        } else {
                            Log.d(Tag, "Not Successful");
                            Log.d(Tag, response.raw().toString());
                            responsetext.setText(response.raw().toString());

                        }
                    }

                    @Override
                    public void onFailure(Call<UserMe> call, Throwable t) {
                        Log.d(Tag, "onFailure");
                        responsetext.setText("onFailure");
                    }
                });
~~~

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.


