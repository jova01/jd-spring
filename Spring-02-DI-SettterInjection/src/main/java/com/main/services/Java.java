package com.main.services;

import com.main.interfaces.Course;
import com.main.interfaces.ExtraSessions;
import lombok.Data;

@Data
public class Java implements Course {

    private OfficeHours officeHours;

//    public OfficeHours getOfficeHours() {
//        return officeHours;
//    }
//
//    public void setOfficeHours(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours " + (20 + officeHours.getHours()));
    }
}
