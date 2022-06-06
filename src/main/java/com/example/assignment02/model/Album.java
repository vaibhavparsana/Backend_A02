package com.example.assignment02.model;

public class Album {
    private int albumId;
    private String name;
    private String description;
    private String coverPicUrl;


    public Album(int albumId, String name, String description, String coverPicUrl) {
        this.albumId = albumId;
        this.name = name;
        this.description = description;
        this.coverPicUrl = coverPicUrl;
    }

    public int getAlbumId() {
        return this.albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCoverPicUrl() {
        return this.coverPicUrl;
    }

    public void setCoverPicUrl(String coverPicUrl) {
        this.coverPicUrl = coverPicUrl;
    }

}
