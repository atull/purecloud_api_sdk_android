package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.mypurecloud.sdk.model.ErrorBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface TokensApi {
  /**
   * Delete  auth token used to make the request.
   * 
   * @return Call<String>
   */
  
  @DELETE("api/v2/tokens/me")
  Call<String> deleteMe();
    

}
