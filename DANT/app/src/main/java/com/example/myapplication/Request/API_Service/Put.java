package com.example.myapplication.Request.API_Service;
import com.example.myapplication.Model.updateUser;
import retrofit2.Call;
import retrofit2.http.PUT;
import retrofit2.http.Path;
public class Put {

    @PUT("v1/auth/updateUser/{id}")
    Call<updateUser> updateUserCall(@Path("id") String id) {
        return null;
    }
}
