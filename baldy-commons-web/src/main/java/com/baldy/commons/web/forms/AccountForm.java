package com.baldy.commons.web.forms;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.core.style.ToStringCreator;



/**
 * @author mbmartinez
 */
public class AccountForm {

    private Long id;

    @Pattern(regexp = "^[a-zA-Z0-9_]*$", message = "There are illegal characters in your username. (Accepts a-z, A-Z, 0-9 and _)")
    @Length(min=5, max=20, message = "Username must be between 5-20 characters")
    @NotEmpty(message = "Username is required")
    private String username;

    @Length(min=5, max=20, message = "Password must be between 5-20 characters")
    @NotEmpty(message = "Password is required")
    private String password;

    @NotEmpty(message = "Confirm password is required")
    private String confirmpw;

    @Override
    public String toString() {
        return new ToStringCreator(this)
        .append("id", id)
        .append("username", username)
        .append("password", null == password || password.length() < 1 ? "None" : "[protected]")
        .toString();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmpw() {
        return confirmpw;
    }

    public void setConfirmpw(String confirmpw) {
        this.confirmpw = confirmpw;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
