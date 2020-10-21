package com.main.services;

import com.main.interfaces.Course;
import lombok.Data;

public class Java implements Course {

    public int hours;
    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours " + (hours+20));
    }
}
