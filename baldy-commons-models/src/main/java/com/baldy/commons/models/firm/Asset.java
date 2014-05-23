package com.baldy.commons.models.firm;

import java.math.BigDecimal;

import javax.persistence.Column;

import com.baldy.commons.models.ref.RentalPeriod;

/**
 * An asset is an Article that is leased.
 * @author mbmartinez
 */
public class Asset extends Article {

    @Column(name = "RENTAL_PERIOD")
    private RentalPeriod rentalPeriod;

    @Column(name = "PRICE_PER_RENTAL_PERIOD")
    private BigDecimal pricePerRentalPeriod;

    public RentalPeriod getRentalPeriod() {
        return rentalPeriod;
    }
    public void setRentalPeriod(RentalPeriod rentalPeriod) {
        this.rentalPeriod = rentalPeriod;
    }
    public BigDecimal getPricePerRentalPeriod() {
        return pricePerRentalPeriod;
    }
    public void setPricePerRentalPeriod(BigDecimal pricePerRentalPeriod) {
        this.pricePerRentalPeriod = pricePerRentalPeriod;
    }

}
