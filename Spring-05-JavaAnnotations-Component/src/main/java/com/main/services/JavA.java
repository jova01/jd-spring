package com.main.services;

import com.main.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class JavA implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching Java hours: 30");
    }
}
