package com.firstapp.services;

import com.firstapp.interfaces.Course;
import com.firstapp.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    @Value("${instructor}")
    private String instructor;

    public String getInstructor() {
        return instructor;
    }
    @Autowired
    public Selenium selenium;



    @Autowired
    public ExtraSessions extraSessions;

    @Override
    public int getTeachingHours() {
        return 20 + extraSessions.getHours();
    }
}
