package com.firstapp.services;

import com.firstapp.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {
    public String str="Namespaces";

    @Override
    public int getTeachingHours() {
        return 10;
    }
}
