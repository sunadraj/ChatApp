package com.example.sunadchatapp.Model;

public class User {

    private String id;
    private String username;
    private String imageURL;
    private String status;


    public User(String id, String username, String imageurl, String status) {
        this.id = id;
        this.username = username;
        this.imageURL = imageurl;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public User() {

    }

    public void setStatus(String status) {
        this.status = status;
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
