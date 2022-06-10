package com.example.patterns.util;

//acts as our database or network(cloud storage)
public class MyModel {

   public String appName;
    public int appDownloads;
    public int apprating;

//constructors
    public MyModel(String appName, int appDownloads, int apprating) {
        this.appName = appName;
        this.appDownloads = appDownloads;
        this.apprating = apprating;
    }

    //getters and setters
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public int getAppDownloads() {
        return appDownloads;
    }

    public void setAppDownloads(int appDownloads) {
        this.appDownloads = appDownloads;
    }

    public int getApprating() {
        return apprating;
    }

    public void setApprating(int apprating) {
        this.apprating = apprating;
    }
}
