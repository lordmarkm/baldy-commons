package com.baldy.commons.models.image.web;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.baldy.commons.models.BaseNamedEntity;
import com.baldy.commons.models.image.Image;

/**
 * An image hosted on some other site, such as imgur.
 * @author mbmartinez
 */
@Entity(name = "WEB_IMG")
public class WebImage extends BaseNamedEntity implements Image {

    @Column(name = "URL")
    private String url;

    @Override
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
