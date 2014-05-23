package com.baldy.commons.repo.firm;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baldy.commons.models.firm.Firm;

/**
 * @author mbmartinez
 */
public interface FirmService extends JpaRepository<Firm, Long> {

}
