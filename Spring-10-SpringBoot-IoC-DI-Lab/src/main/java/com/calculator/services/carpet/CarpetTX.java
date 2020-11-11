package com.calculator.services.carpet;

import com.calculator.enums.City;
import com.calculator.interfaces.carpetPrices.Carpet;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class CarpetTX implements Carpet {

    private static final Map<City, BigDecimal> sqPriceForCity= new HashMap<>();

    static {
        sqPriceForCity.put(City.AUSTIN, new BigDecimal("1.32"));
        sqPriceForCity.put(City.DULLES, new BigDecimal("1.75"));
        sqPriceForCity.put(City.SAN_ANTONIO, new BigDecimal("2.20"));
    }

    @Override
    public BigDecimal getSqFtPrice(City city) {
/*
        BigDecimal collect= sqPriceForCity.entrySet().stream()
                .filter(each -> each.getKey()==city)
                .map(Map.Entry::getValue)
                .findFirst().get();
          return collect!=null ? collect : defaultValue;

 */

        return sqPriceForCity.get(city) != null ? sqPriceForCity.get(city): BigDecimal.ZERO;

    }
}
