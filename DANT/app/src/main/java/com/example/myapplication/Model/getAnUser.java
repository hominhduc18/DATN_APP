package com.example.myapplication.Model;

public class getAnUser {
    private String id;

    public getAnUser(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "getAn{" +
                "id='" + id + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
