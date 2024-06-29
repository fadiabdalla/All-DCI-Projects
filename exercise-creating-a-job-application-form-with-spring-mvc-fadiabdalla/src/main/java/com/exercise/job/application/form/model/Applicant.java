package com.exercise.job.application.form.model;


import jakarta.validation.constraints.NotNull;

public class Applicant {

    @NotNull(message = "*Requiered field")
    private String name;
    @NotNull(message = "*Requiered field")
    private String email;
    @NotNull(message = "*Requiered field")
    private String address;
    @NotNull(message = "*Requiered field")
    private String phoneNumber;
    @NotNull(message = "*Requiered field")
    private String jobPosition;
    @NotNull(message = "*Requiered field")
    private String jobLocation;
    private String coverLetter;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public String getJobLocation() {
        return jobLocation;
    }

    public void setJobLocation(String jobLocation) {
        this.jobLocation = jobLocation;
    }

    public String getCoverLetter() {
        return coverLetter;
    }

    public void setCoverLetter(String coverLetter) {
        this.coverLetter = coverLetter;
    }
}
