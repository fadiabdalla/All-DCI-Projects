package com.example.springmvcvalidation.model;

import jakarta.validation.constraints.*;

public class Subscriber {

    private String fullName;

    @NotNull(message = "is required")
    @Size(min=1, message = "is required")
    private String address;

   @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digits")
    private String postalCode;

    @Min(value=18, message = "must be greater than or equal 18")
    @Max(value=99, message = "Enter your real age :)")
    private Integer age;
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
