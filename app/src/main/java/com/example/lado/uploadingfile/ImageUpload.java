package com.example.lado.uploadingfile;

/**
 * Created by lado on 19.10.17.
 */

public class ImageUpload {

    public String name;
    public String url;

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public ImageUpload(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public ImageUpload(){}
}