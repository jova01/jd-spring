package com.main.services;

import com.main.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class API implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Working with API");
    }
}
