package com.example.sunadchatapp.Model;

public class User {

    private String id;
    private String username;
    private String imageURL;
    private String status;
    private String search;


    public User(String id, String username, String imageurl, String status, String search) {
        this.id = id;
        this.username = username;
        this.imageURL = imageurl;
        this.status = status;
        this.search = search;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
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
