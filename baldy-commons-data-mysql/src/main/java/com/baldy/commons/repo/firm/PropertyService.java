package com.baldy.commons.repo.firm;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baldy.commons.models.firm.Property;

/**
 * @author mbmartinez
 */
public interface PropertyService extends JpaRepository<Property, Long> {

}
