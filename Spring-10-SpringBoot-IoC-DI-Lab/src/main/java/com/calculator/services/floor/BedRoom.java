package com.calculator.services.floor;

import com.calculator.interfaces.floorTypes.Floor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.math.BigDecimal;

@Component
public class BedRoom implements Floor {

    @Value("${width}")
    BigDecimal width;


    @Override
    public BigDecimal getArea() {
        return width.pow(2); // powerOf
    }
}
