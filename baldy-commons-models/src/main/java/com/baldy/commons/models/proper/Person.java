package com.baldy.commons.models.proper;

import javax.persistence.Embedded;
import javax.persistence.Entity;

import org.springframework.util.ObjectUtils;

import com.baldy.commons.models.BaseBaldyEntity;

@Entity(name = "PERSON")
public class Person extends BaseBaldyEntity {

    @Embedded
    private Name properName;

    @Embedded
    private Address address;

    @Override
    public String toString() {
        return ObjectUtils.nullSafeToString(properName)
                + ", " + ObjectUtils.nullSafeToString(address);
    }

    public Name getProperName() {
        return properName;
    }

    public void setProperName(Name properName) {
        this.properName = properName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
