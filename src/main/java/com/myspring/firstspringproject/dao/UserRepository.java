package com.myspring.firstspringproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.myspring.firstspringproject.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {

    Iterable<User> findAllByOrderByIdDesc();
}
