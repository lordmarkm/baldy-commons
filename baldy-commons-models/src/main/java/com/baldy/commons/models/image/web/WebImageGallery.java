package com.baldy.commons.models.image.web;

import static javax.persistence.CascadeType.ALL;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.baldy.commons.models.BaseNamedEntity;
import com.baldy.commons.models.image.Gallery;
import com.google.common.collect.Lists;

/**
 * @author mbmartinez
 */
@Entity(name = "WEB_IMG_GALLERY")
public class WebImageGallery extends BaseNamedEntity implements Gallery<WebImage> {

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "THUMB_IMG_ID")
    private WebImage thumbnail;

    @OneToMany(cascade = ALL)
    private List<WebImage> images;

    @Override
    public List<WebImage> getImages() {
        if (null == images) {
            this.images = Lists.newArrayList();
        }
        return images;
    }

    @Override
    public WebImage getThumbnail() {
        if (null == thumbnail && images.size() > 0) {
            return images.get(0);
        } else {
            return thumbnail;
        }
    }

    public void setImages(List<WebImage> images) {
        this.images = images;
    }
    public void setThumbnail(WebImage thumbnail) {
        this.thumbnail = thumbnail;
    }

}
