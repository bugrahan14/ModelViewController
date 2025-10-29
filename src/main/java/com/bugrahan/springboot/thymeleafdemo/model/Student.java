package com.bugrahan.springboot.thymeleafdemo.model;

public class Student {

    private String firstName;
    private String lastName;
    private String country;

    public Student(){

    }

    public Student(String firstName, String lastName ,String country){
        this.firstName=firstName;
        this.lastName=lastName;
        this.country=country;
    }


    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public String getCountry(){
        return this.country;
    }

    public void setCountry(String country){
        this.country=country;
    }

}






















