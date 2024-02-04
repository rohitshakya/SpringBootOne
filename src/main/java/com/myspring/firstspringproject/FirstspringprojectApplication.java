package com.myspring.firstspringproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.myspring.firstspringproject.dao.PersonRepository;
import com.myspring.firstspringproject.entity.Person;

@SpringBootApplication
public class FirstspringprojectApplication {

    @Autowired
    private PersonRepository personRepository;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(FirstspringprojectApplication.class, args);

        FirstspringprojectApplication application = context.getBean(FirstspringprojectApplication.class);
        application.addData();
    }

    private void addData() {
        Person person = new Person();
        person.setName("rohit");
        person.setCity("Delhi");
        person.setMobile("7503356173");

        personRepository.save(person);
    }
}
