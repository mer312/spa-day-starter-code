package org.launchcode.spaday.data;

import org.launchcode.spaday.models.User;

import java.util.ArrayList;

public class UserData {

    private static ArrayList<User> myUsers = new ArrayList<>();

    public static ArrayList<User> getAll(){
        return myUsers;
    }

    public static User getById(int id){
        for (User user : myUsers){
            if(user.getId() ==id) return user;
        }
        return null;
    }



}
