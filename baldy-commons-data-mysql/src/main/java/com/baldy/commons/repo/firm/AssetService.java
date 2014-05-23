package com.baldy.commons.repo.firm;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baldy.commons.models.firm.Asset;

/**
 * @author mbmartinez
 */
public interface AssetService extends JpaRepository<Asset, Long> {

}
