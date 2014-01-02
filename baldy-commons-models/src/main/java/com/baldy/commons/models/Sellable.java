package com.baldy.commons.models;

import java.math.BigDecimal;

/**
 * @author mbmartinez
 */
public interface Sellable extends Commodity {

    BigDecimal getPrice();

}
