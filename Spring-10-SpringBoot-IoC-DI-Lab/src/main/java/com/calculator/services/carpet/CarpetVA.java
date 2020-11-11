package com.calculator.services.carpet;

import com.calculator.enums.City;
import com.calculator.interfaces.carpetPrices.Carpet;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Component
public class CarpetVA implements Carpet {

    private static final Map<City, BigDecimal> sqPriceForCity= new HashMap<>();

    static {
        sqPriceForCity.put(City.MCLEAN, new BigDecimal("4.32"));
        sqPriceForCity.put(City.ARLINGTON, new BigDecimal("2.92"));
        sqPriceForCity.put(City.FAIRFAX, new BigDecimal("4.65"));
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

