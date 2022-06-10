package com.example.patterns.ui;

public interface AppView {
    //this is the linkage between the presenter and the view
    void onGetAppName(String appname);
    //void onGetAppDownloads(int download);
    //void onGetAppRating(int rating);
}
