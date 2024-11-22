package org.example.wishlistkl.model;

import java.util.ArrayList;
import java.util.List;

public class WishList {

    private Integer wishlistId;
    private String username;
    private List<String> objects = new ArrayList<>();

    public WishList(String username, List<String> objects) {
        this.username = (username != null) ? username : "";
        this.objects = (objects != null) ? objects : new ArrayList<>();
    }


    public WishList() {
    }

    public Integer getWishlistId() {
        return wishlistId;
    }

    public void setWishlistId(Integer wishlistId) {
        this.wishlistId = wishlistId;
    }


    public void addObject(String object) {
        objects.add(object);
    }

    public List<String> getObjects() {
        return objects;
    }

    public void setObjects(List<String> objects) {
        this.objects = objects;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "WishList{" +
                "username='" + username + '\'' +
                ", objects=" + objects +
                '}';
    }

}


