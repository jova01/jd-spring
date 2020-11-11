package com.calculator.calculator;

import com.calculator.enums.City;
import com.calculator.interfaces.carpetPrices.Carpet;
import com.calculator.interfaces.floorTypes.Floor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Calculator {

    @Qualifier("carpetVA")
    @Autowired
    private Carpet carpet;


    @Autowired
    private Floor kitchen;

    @Autowired
    private Floor bedRoom;

    @Autowired
    private Floor livingRoom;

    public String getTotalCarpetCost(City city) throws Exception {
        BigDecimal cost= carpet.getSqFtPrice(city)
                               .multiply(livingRoom.getArea());

        if(cost.compareTo(BigDecimal.ZERO)==0)
            throw new Exception("This city does not exist");

        return "Total Cost for Carpet: "+ cost;
    }
}
