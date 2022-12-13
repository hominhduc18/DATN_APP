package com.example.myapplication.Model;

public class getAllUser {
    private String token;

    @Override
    public String toString() {
        return "getAll{" +
                "token='" + token + '\'' +
                '}';
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public getAllUser(String token) {
        this.token = token;
    }
}
