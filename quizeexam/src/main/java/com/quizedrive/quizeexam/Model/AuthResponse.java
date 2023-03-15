package com.quizedrive.quizeexam.Model;

public class AuthResponse {

     String token;

    public String getToken() {
        return token;
    }

    public AuthResponse() {
    }

    public AuthResponse(String token) {
        this.token = token;
    }

    public void setToken(String token) {
        this.token = token;
    } 
    
}
