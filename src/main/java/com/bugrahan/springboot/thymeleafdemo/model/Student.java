package com.bugrahan.springboot.thymeleafdemo.model;

import java.util.List;

public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private String favoriteLanguage;
    private List<String> favoriteOperatingSystems;

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

    public String getFavoriteLanguage(){
        return this.favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage){
        this.favoriteLanguage=favoriteLanguage;
    }

    public List<String> getFavoriteOperatingSystems(){
        return this.favoriteOperatingSystems;
    }

    public void setFavoriteOperatingSystems(List<String> favoriteOperatingSystems){
        this.favoriteOperatingSystems=favoriteOperatingSystems;
    }

}






















