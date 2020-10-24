package main.services;

import main.interfaces.ExtraSessions;
import org.springframework.stereotype.Component;

@Component
public class OfficeHour implements ExtraSessions {
    @Override
    public int getHours() {
        return 100;
    }
}
