package com.app.main.dto;

public class SendPasswordChangeEmailRequest {
    public String username;
    public String email;

    public SendPasswordChangeEmailRequest(){

    }

    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
}
