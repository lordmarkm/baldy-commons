package com.baldy.commons.models.firm;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author mbmartinez
 * Item - an Article that is sold
 */
@Entity(name = "ARTICLE")
public class Item extends Article {

    @Column(name = "PRODUCTION_PRICE")
    private BigDecimal productionPrice;

    @Column(name = "SELLING_PRICE")
    private BigDecimal sellingPrice;

    public BigDecimal getProductionPrice() {
        return productionPrice;
    }

    public void setProductionPrice(BigDecimal productionPrice) {
        this.productionPrice = productionPrice;
    }

    public BigDecimal getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(BigDecimal sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

}
