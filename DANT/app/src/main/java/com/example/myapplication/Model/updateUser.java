package com.example.myapplication.Model;

public class updateUser {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public updateUser(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "update{" +
                "id='" + id + '\'' +
                '}';
    }
}
