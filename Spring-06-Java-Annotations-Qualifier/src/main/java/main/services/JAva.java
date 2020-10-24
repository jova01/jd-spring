package main.services;

import main.interfaces.Course;
import main.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class JAva implements Course {

    @Autowired
    private ExtraSessions mockInterviewHours;

    @Autowired
    private ExtraSessions officeHour;

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: " + ("officeHour: "+ officeHour.getHours()
                                + " , mockInterviewHours : " +mockInterviewHours.getHours()));
    }

/*
    @Autowired  // if one param Constructor - Autowired annotation not needed
    public JAva(@Qualifier("officeHour") ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

 */

}
