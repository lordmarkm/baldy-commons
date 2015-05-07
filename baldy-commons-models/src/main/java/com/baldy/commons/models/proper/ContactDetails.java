package com.baldy.commons.models.proper;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author mbmartinez
 */
@Embeddable
public class ContactDetails {

    @Column(name = "CELLPHONE")
    private String cellphone;

    @Column(name = "LANDLINE")
    private String landline;

    @Column(name = "EMAIL")
    private String email;

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getLandline() {
        return landline;
    }

    public void setLandline(String landline) {
        this.landline = landline;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
