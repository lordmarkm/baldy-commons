package com.baldy.commons.models.proper;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {

    @Column(name = "ADDR_LINE1")
    private String addressLine1;

    @Column(name = "ADDR_LINE2")
    private String addressLine2;

    @Column(name = "ADDR_CITY")
    private String city;

    @Column(name = "ADDR_PROVINCE")
    private String province;

    @Column(name = "ADDR_ZIP")
    private String zip;

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

}
