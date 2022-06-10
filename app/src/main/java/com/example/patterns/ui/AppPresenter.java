package com.example.patterns.ui;

import com.example.patterns.util.MyModel;

//this will acts like as presenter [the waiter]
public class AppPresenter {
    //the link between presenter and the view(mainactivity) is done by the interface

    //link instance
    AppView appView;//instance of AppView

    public AppPresenter(AppView appView) {
        this.appView = appView;
    }

    //linkage between presenter and model
    public MyModel GetAppFromModel(){
        return new MyModel("Frisbee APP", 9000000, 5); //object of mymodel
    }

  //linkage between presenter and MainActivity(calling the interface)
    public void getAppDETAILS(){
        appView.onGetAppName(GetAppFromModel().getAppName());
        //appView.onGetAppDownloads(GetAppFromModel().getAppDownloads());
        //appView.onGetAppRating(GetAppFromModel().getApprating());

    }

}
