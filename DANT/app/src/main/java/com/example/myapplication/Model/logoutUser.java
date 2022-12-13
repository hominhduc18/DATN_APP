package com.example.myapplication.Model;

public class logoutUser {
    private String token;

    @Override
    public String toString() {
        return "logout{" +
                "token='" + token + '\'' +
                '}';
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public logoutUser(String token) {
        this.token = token;
    }
}
