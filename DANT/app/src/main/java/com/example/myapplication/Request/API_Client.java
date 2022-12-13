package com.example.myapplication.Request;
import com.example.myapplication.Request.API_Service.api_service;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class API_Client {
    private static Retrofit ApiServiceClient;
    public static Retrofit getApiServiceClient() {
        if (ApiServiceClient == null) {
            ApiServiceClient = new Retrofit.Builder()
                    .baseUrl(api_service.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return ApiServiceClient;
    }
}
