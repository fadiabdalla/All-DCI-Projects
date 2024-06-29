package com.exercise.mvc.validation.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

public class Product {

    private String name;
    private String description;
    private String availability;
    @Max(value = 100, message = "quantity must be less than or equal 100")
    @Min(value = 0, message = "quantity must be greater than or equal 0")
   private Integer quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
