package com.example.signingup;

import java.util.HashMap;

public class User {

    private String fullName;
    private int age;
    private String email;
    private String userUid;

    private HashMap<String,String> friends = new HashMap<>();
    private HashMap<String,String> MyMovies = new HashMap<>();



    public User() {

    }

    public User(String fullName, int age , String email){
        this.fullName   = fullName;
        this.age        = age;
        this.email      = email;

    }


    public int getAge() {
        return age;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public HashMap<String, String> getFriends() {
        return friends;
    }

    public String getUserUid() {
        return userUid;
    }

    public HashMap<String, String> getMyMovies() {
        return MyMovies;
    }

}
