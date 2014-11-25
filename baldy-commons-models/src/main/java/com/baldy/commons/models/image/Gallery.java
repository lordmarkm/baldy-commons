package com.baldy.commons.models.image;

import java.util.List;

/**
 * @author mbmartinez
 * @param <E>
 */
public interface Gallery<E extends Image> {

    E getThumbnail();
    List<E> getImages();

}
