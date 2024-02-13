package com.myspring.firstspringproject.dao;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.myspring.firstspringproject.entity.Ratings;


@Repository
@ComponentScan
public interface RatingsRepository extends JpaRepository<Ratings, Long> {
    @Query(value="SELECT AVG(r.rating) FROM ratings r WHERE r.hotel_id = :hotelId",nativeQuery = true)
    Double findAverageRatingByHotelId(@Param("hotelId") Long hotelId);
}

