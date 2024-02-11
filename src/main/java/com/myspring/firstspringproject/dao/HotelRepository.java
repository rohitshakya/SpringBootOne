package com.myspring.firstspringproject.dao;

import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.myspring.firstspringproject.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel,Long> {

    Iterable<Hotel> findAllByOrderByIdDesc();
}
