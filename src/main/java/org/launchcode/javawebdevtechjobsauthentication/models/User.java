package org.launchcode.javawebdevtechjobsauthentication.models;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

//The class needs to be an entity
@Entity
public class User extends AbstractEntity {

    //The class needs to have username and encrypted password fields
    @NotNull
    private String username;

    @NotNull
    private String pwHash;

    //Add a static BCryptPasswordEncoder variable
    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    //The class needs to have appropriate constructors, getters, setters
    public User() {}
    //Update the constructor that has arguments to encode the password field
    public User(String username, String password) {
        this.username = username;
        this.pwHash = encoder.encode(password);
    }

    public String getUsername() {
        return username;
    }
    //Add a method to check password values
    public boolean isMatchingPassword(String password) {
        return encoder.matches(password, pwHash);
    }
}