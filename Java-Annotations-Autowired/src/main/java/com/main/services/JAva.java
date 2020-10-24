package com.main.services;

import com.main.interfaces.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JAva implements Course {

    @Autowired
    private  OfficeHours officeHours;

/*
    //Constructor injection
    //@Autowired
    public JAva(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

 */

/*
    // Setter Injection
    @Autowired
    public void setOfficeHours(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

 */

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching Java hours: "+ (30+ officeHours.getHours()));
    }
}
