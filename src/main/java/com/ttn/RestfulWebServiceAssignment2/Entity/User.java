package com.ttn.RestfulWebServiceAssignment2.Entity;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.Size;
public class User {

    @JsonProperty("user_id")
    private long id;

    @JsonProperty("user_name")
    @Size(min = 2 ,message = "Name should have atleast 2 characters")
    private String name;

    public User(long id, String name) {
        super();
        this.id = id;
        this.name = name;

    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.id +" " +this.name;
    }
}
