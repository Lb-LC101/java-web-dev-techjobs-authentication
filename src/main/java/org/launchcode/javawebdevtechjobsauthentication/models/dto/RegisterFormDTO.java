package org.launchcode.javawebdevtechjobsauthentication.models.dto;

//registration form DTO with username and password fields and a field to verify a password
public class RegisterFormDTO extends LoginFormDTO {
    private String verifyPassword;

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }
}
