package com.myspring.firstspringproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String location;
    private String description;
    private Double rating; // optional
    public Hotel() {
    }
    public Hotel(String name, String location, String description, Double rating) {
        this.name = name;
        this.location = location;
        this.description = description;
        this.rating = rating;
    }
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
   
    @Override
    public String toString() {
        return "Hotel [id=" + id + ", name=" + name + ", location=" + location + ", description=" + description
                + ", rating=" + rating + "]";
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setRating(Double rating) {
        this.rating = rating;
    }
    public String getLocation() {
        return location;
    }
    public String getDescription() {
        return description;
    }
    public Double getRating() {
        return rating;
    }

    // Getters and setters
}
