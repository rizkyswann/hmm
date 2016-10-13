package com.learn2crack.loginregistration;

import com.learn2crack.loginregistration.models.ServerRequest;
import com.learn2crack.loginregistration.models.ServerResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface RequestInterface {

    @POST("data-antrian/")
    Call<ServerResponse> operation(@Body ServerRequest request);

    @GET("data-antrian/DataAntrian.json")
    Call<JSONResponse> getJSON();

}
