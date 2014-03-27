package com.baldy.commons.models;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * The Grandfather of every entity from now on.
 * @author mbmartinez
 */
@MappedSuperclass
public abstract class BaseBaldyEntity {

    @Column
    protected String name;

    @Column
    protected String description;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

}
