package com.example.lado.uploadingfile;

/**
 * Created by lado on 25.10.17.
 */
import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class UploadInfo {

    public String name;
    public String url;

    public UploadInfo() {
    }

    public UploadInfo(String name, String url) {
        this.name = name;
        this.url= url;
    }
}
