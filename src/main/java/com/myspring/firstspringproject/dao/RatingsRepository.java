package com.myspring.firstspringproject.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.myspring.firstspringproject.entity.Ratings;

public interface RatingsRepository extends JpaRepository<Ratings,Long> {

}
