package com.calculator.interfaces.carpetPrices;

import com.calculator.enums.City;

import java.math.BigDecimal;

public interface Carpet {
    BigDecimal getSqFtPrice(City city);
}
