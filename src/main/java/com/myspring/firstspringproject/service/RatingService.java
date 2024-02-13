package com.myspring.firstspringproject.service;

import org.springframework.stereotype.Service;
import com.myspring.firstspringproject.dao.RatingsRepository;


@Service
public class RatingService {

    private RatingsRepository ratingsRepository;

    public RatingService(RatingsRepository ratingsRepository) {
        this.ratingsRepository = ratingsRepository;
    }

    public double calculateAverageRating(Long hotelId) {
        Double average = ratingsRepository.findAverageRatingByHotelId(hotelId);
        return average != null ? average : 0.0;
    }
}