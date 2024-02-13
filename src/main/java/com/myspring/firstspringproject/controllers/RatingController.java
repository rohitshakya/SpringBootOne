package com.myspring.firstspringproject.controllers;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.myspring.firstspringproject.dao.HotelRepository;
import com.myspring.firstspringproject.dao.RatingsRepository;
import com.myspring.firstspringproject.dao.UserRepository;
import com.myspring.firstspringproject.entity.Hotel;
import com.myspring.firstspringproject.entity.Ratings;
import com.myspring.firstspringproject.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@ResponseBody
@RestController
@RequestMapping("/api/v1/")
public class RatingController {

    @Autowired
    private HotelRepository hotelRepository;
    
    @GetMapping("/hotels")
    public Iterable<Hotel> getAllHotels(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size) {
        PageRequest pageable = PageRequest.of(page, size);
        return hotelRepository.findAll(pageable).getContent();
    }
     @PostMapping("/addHotels")
    public ResponseEntity<Hotel> addHotel(@RequestBody Hotel hotel) {
        @SuppressWarnings("null")
        Hotel savedHotel = hotelRepository.save(hotel);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedHotel);
    }
     @Autowired
    private RatingsRepository ratingsRepository;

    @PostMapping("/addRatings")
    public Ratings addRating(@RequestBody Ratings rating) {
        return ratingsRepository.save(rating);
    }

    @GetMapping("/ratings")
    public Iterable<Ratings> getAllRatings(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size) {
        PageRequest pageable = PageRequest.of(page, size);
        return ratingsRepository.findAll(pageable).getContent();
    }
     @Autowired
    private UserRepository userRepository;

    // Create a new user
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User savedUser = userRepository.save(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    // Retrieve all users
    @GetMapping("/users")
    public Iterable<User> getAllUsers(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size) {
        PageRequest pageable = PageRequest.of(page, size);
        return userRepository.findAll(pageable).getContent();
    }

    // Update a user
    @PutMapping("/{userId}")
    public ResponseEntity<User> updateUser(@PathVariable Long userId, @RequestBody User user) {
        if (userRepository.existsById(userId)) {
            user.setId(userId); // Ensure the ID is set for update
            User updatedUser = userRepository.save(user);
            return new ResponseEntity<>(updatedUser, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Delete a user
    @DeleteMapping("/{userId}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long userId) {
        if (userRepository.existsById(userId)) {
            userRepository.deleteById(userId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
   
}
