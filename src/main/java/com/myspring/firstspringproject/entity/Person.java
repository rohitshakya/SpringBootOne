package com.myspring.firstspringproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String city;
    private String mobile;
    // Other fields and methods
    public Person(Long id, String name, String city, String mobile) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.mobile = mobile;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCity(String city) {
        this.city = city;
    }
    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", city=" + city + ", mobile=" + mobile + "]";
    }
    public Person() {
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getCity() {
        return city;
    }
    public String getMobile() {
        return mobile;
    }
    
    // Getters and setters
}
