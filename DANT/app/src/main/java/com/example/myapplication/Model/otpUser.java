package com.example.myapplication.Model;

public class otpUser {
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "otp{" +
                "email='" + email + '\'' +
                '}';
    }
}
