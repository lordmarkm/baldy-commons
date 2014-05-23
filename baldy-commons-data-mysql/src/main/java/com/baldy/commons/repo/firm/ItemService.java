package com.baldy.commons.repo.firm;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baldy.commons.models.firm.Item;

/**
 * @author mbmartinez
 */
public interface ItemService extends JpaRepository<Item, Long> {

}
