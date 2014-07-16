package com.baldy.commons.security.services;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.baldy.commons.security.models.Account;
import com.baldy.commons.security.services.AccountService;

@Service
public class BaseBaldyUserDetailsService implements UserDetailsService {

    private static Logger LOG = LoggerFactory.getLogger(BaseBaldyUserDetailsService.class);

    @Resource
    private AccountService accounts;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        LOG.info("Authenticating user. username={}", username);

        Account account = accounts.findByUsername(username);
        if(null == account) {
            throw new UsernameNotFoundException("User " + username + " not found.");
        }

        List<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
        String[] authStrings = account.getAuthorities().split(", ");
        for(String authString : authStrings) {
            authorities.add(new SimpleGrantedAuthority(authString));
        }

        UserDetails ud = new User(account.getUsername(), account.getPassword(), authorities);
        LOG.info("Authenticated. user details={}", ud);
        return ud;
    }

}