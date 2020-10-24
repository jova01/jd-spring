package com.main.services;

import com.main.interfaces.Course;
import com.main.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JAva implements Course {

    @Autowired
    private ExtraSessions extraSessions;

/*
    //Constructor injection
    //@Autowired
    public JAva(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

 */

/*
    // Setter Injection
    @Autowired
    public void setOfficeHours(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

 */

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching Java hours: "+ (30+ extraSessions.getHours()));
    }
}
