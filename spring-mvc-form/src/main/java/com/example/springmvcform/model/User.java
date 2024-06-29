package com.example.springmvcform.model;

import java.util.List;

public class User {

    private String fullName;
    private String gender;

    private Integer age;

    private String movie;

    private String cinema;

    private List<String> movieQuality;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public User (){}

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getCinema() {
        return cinema;
    }

    public void setCinema(String cinema) {
        this.cinema = cinema;
    }

    public List<String> getMovieQuality() {
        return movieQuality;
    }

    public void setMovieQuality(List<String> movieQuality) {
        this.movieQuality = movieQuality;
    }
}


