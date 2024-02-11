package com.myspring.firstspringproject.controllers;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.myspring.firstspringproject.dao.HotelRepository;
import com.myspring.firstspringproject.entity.Hotel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@ResponseBody
public class RatingController {

    @Autowired
    private HotelRepository hotelRepository;
    
    @GetMapping("/hotels")
    public Iterable<Hotel> getAllHotels() {
        return hotelRepository.findAllByOrderByIdDesc();
    }
     @PostMapping("/addHotels")
    public ResponseEntity<Hotel> addHotel(@RequestBody Hotel hotel) {
        @SuppressWarnings("null")
        Hotel savedHotel = hotelRepository.save(hotel);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedHotel);
    }
    
   
}
