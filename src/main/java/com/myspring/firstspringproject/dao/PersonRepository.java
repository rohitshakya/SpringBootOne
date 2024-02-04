package com.myspring.firstspringproject.dao;

import org.springframework.data.repository.CrudRepository;

import com.myspring.firstspringproject.entity.Person;

public interface PersonRepository extends CrudRepository<Person,Long> {

    
}
