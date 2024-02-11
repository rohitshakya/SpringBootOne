package com.myspring.firstspringproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Ratings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    public Long getId() {
        return id;
    }
    public Ratings(Long id, Hotel hotel, User user, Integer rating, String review) {
        this.id = id;
        this.hotel = hotel;
        this.user = user;
        this.rating = rating;
        this.review = review;
    }
    @Override
    public String toString() {
        return "Rating [id=" + id + ", hotel=" + hotel + ", user=" + user + ", rating=" + rating + ", review=" + review
                + "]";
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Hotel getHotel() {
        return hotel;
    }
    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public Integer getRating() {
        return rating;
    }
    public void setRating(Integer rating) {
        this.rating = rating;
    }
    public String getReview() {
        return review;
    }
    public void setReview(String review) {
        this.review = review;
    }
    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user; // Optional if you're tracking users
    
    private Integer rating;
    private String review; // optional

    // Getters and setters
}
