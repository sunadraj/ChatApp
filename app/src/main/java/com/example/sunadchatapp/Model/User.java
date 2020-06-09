package com.example.sunadchatapp.Model;

public class User {

    public String id;
    public String username;
    public String imageURL;

    public User() {

    }

    public User(String id, String username, String imageurl) {
        this.id = id;
        this.username = username;
        this.imageURL = imageurl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageurl) {
        this.imageURL = imageurl;
    }
}
