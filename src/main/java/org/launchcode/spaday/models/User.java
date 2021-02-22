package org.launchcode.spaday.models;

import java.util.Date;

public class User {

    private static int nextId = 1;
    private int id;
    private String username;
    private String email;
    private String password;
    private final Date joinedDate;

    public User( ){
        id = nextId;
        nextId++;
        this.joinedDate= joinedDate;
    }

    public Date getJoinedDate() {
        return joinedDate;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString(){
        return username+", "+email +", " + password;
    }
}
