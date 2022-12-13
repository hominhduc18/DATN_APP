package com.example.myapplication.Request.API_Service;
import com.example.myapplication.Model.deleteUser;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Path;
public class Delete {
    @DELETE("v1/user/deleteUser/{id}")
    Call<deleteUser> deleteUserCall(@Path("id") String id) {

        return null;
    }
}
