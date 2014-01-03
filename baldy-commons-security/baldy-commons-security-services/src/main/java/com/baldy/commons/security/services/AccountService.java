package com.baldy.commons.security.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baldy.commons.security.models.Account;



/**
 * @author mbmartinez
 */
public interface AccountService extends JpaRepository<Account, Long> {

	Account findByUsername(String name);

}
