package com.baldy.commons.models;

import java.math.BigDecimal;

/**
 * @author mbmartinez
 */
public interface Rentable extends Commodity {

    String getUnit();
    BigDecimal getPricePerUnit();
    
}
