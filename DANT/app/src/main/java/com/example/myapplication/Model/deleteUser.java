package com.example.myapplication.Model;

public class deleteUser {
    private String id;
    private String token;

    public deleteUser(String id, String token) {
        this.id = id;
        this.token = token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public deleteUser(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "delete{" +
                "id='" + id + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
