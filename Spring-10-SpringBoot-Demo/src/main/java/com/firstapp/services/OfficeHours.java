package com.firstapp.services;

import com.firstapp.interfaces.ExtraSessions;
import org.springframework.stereotype.Component;

@Component
public class OfficeHours implements ExtraSessions {
    @Override
    public int getHours() {
        return 50;
    }
}
