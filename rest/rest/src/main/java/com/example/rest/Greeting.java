package com.example.rest;

public class Greeting {

    private String firstName;

    public Greeting(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

}
