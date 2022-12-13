package com.example.myapplication.Request.API_Service;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;

import com.example.myapplication.Model.getAllUser;
import com.example.myapplication.Model.getAnUser;
public class Get {
    @GET("v1/user/getAllUser")
    Call<getAllUser> getAllUserCall(@Body getAllUser getAllUser) {
        return null;
    }

    @GET("v1/user/getAnUser")
    Call<getAnUser> getAnUserCall(@Body getAnUser getAnUser) {
        return null;
    }

}
