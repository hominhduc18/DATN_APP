package com.example.myapplication.Request.API_Service;
import com.example.myapplication.Model.loginUser;
import com.example.myapplication.Model.logoutUser;
import com.example.myapplication.Model.otpUser;
import com.example.myapplication.Model.registerUser;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public class Post {



    @POST("v1/user/loginUser")
    Call<loginUser> loginUserCall(@Body loginUser loginUser) {
        return null;
    }
    @POST("v1/user/register")
    Call<registerUser> registerUserCall(@Body registerUser registerUser) {
        return null;
    }

    @POST("v1/user/logoutUser")
    Call<logoutUser> logoutUserCall(@Body logoutUser logoutUser) {
        return null;
    }
    @POST("v1/user/email_send")
    Call<otpUser> otpUserCall(@Body otpUser otpUser) {
        return null;
    }


}
