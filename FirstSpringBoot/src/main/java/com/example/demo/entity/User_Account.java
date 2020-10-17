package com.example.demo.entity;

public class User_Account {
    private  long id;
    private  String user_code;
    private  String user_name;
    private  String user_password;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUser_code() {
        return user_code;
    }

    public void setUser_code(String user_code) {
        this.user_code = user_code;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getUser_password(){
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }
}
