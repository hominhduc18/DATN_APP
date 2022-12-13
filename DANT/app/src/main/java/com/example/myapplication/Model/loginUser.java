package com.example.myapplication.Model;

import com.google.gson.annotations.SerializedName;

public class loginUser {
        @SerializedName("email")
        private String email;
        @SerializedName("password")
        private String password;

        public loginUser(String email, String password) {
            this.email = email;
            this.password = password;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        @Override
        public String toString() {
            return "login{" +
                    "email='" + email + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }
}
