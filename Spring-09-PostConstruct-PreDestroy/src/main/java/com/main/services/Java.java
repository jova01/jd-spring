package com.main.services;

import com.main.interfaces.Course;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Java implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching Java hours: 30");
    }
    @PostConstruct
    public void postConstruct(){
        System.out.println("Executing post construct");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("Executing pre destroy");
    }
}
