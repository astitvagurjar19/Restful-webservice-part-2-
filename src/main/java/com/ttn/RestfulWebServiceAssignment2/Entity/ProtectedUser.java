package com.ttn.RestfulWebServiceAssignment2.Entity;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.validation.constraints.Size;

@JsonFilter("UserPasswordFilter")
public class ProtectedUser {

    private long protectedUserId;

    @Size(min = 2 ,message = "Name should have at least 2 characters")
    private String protectedUserName;

    private String staticPassword;

    private String dynamicPassword;

    public ProtectedUser(long protectedUserId, String protectedUserName, String staticPassword, String dynamicPassword) {
        this.protectedUserId = protectedUserId;
        this.protectedUserName = protectedUserName;
        this.staticPassword = staticPassword;
        this.dynamicPassword = dynamicPassword;
    }

    public long getProtectedUserId() {
        return protectedUserId;
    }

    public void setProtectedUserId(long protectedUserId) {
        this.protectedUserId = protectedUserId;
    }

    public String getProtectedUserName() {
        return protectedUserName;
    }

    public void setProtectedUserName(String protectedUserName) {
        this.protectedUserName = protectedUserName;
    }

    public String getStaticPassword() {
        return staticPassword;
    }

    public void setStaticPassword(String staticPassword) {
        this.staticPassword = staticPassword;
    }

    public String getDynamicPassword() {
        return dynamicPassword;
    }

    public void setDynamicPassword(String dynamicPassword) {
        this.dynamicPassword = dynamicPassword;
    }

    @Override
    public String toString() {
        return this.protectedUserId +" " +this.protectedUserName+" "
                +this.staticPassword + " " + this.dynamicPassword;
    }
}
