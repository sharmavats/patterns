package com.example.patterns.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.patterns.util.MyModel;
import com.example.patterns.R;

public class MainActivity extends AppCompatActivity implements  AppView{//implementing interface AppView for MVP

    //lets organize the packages
    //MVP pattern
    //view:activity with textview and button
    //model: mymodel
    //presenter: Apppresenter and its helping interface appview

    Button btn;
    TextView textView;

    //linking activity with presenter
    AppPresenter appPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //MVC Pattern overview
        //we need to create a button that when the user clicked it, it will display text in textview
        //our main activity acts as an controller
        //our view is textview
        //and our model is MyModel(class)
        textView=findViewById(R.id.textView);
        btn=findViewById(R.id.button);

        appPresenter = new AppPresenter(this);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Calling the Presenter to get data from DB
                // No linkage between Activity and Model
                // Our MainActivity is Handling UI ONLY!!
                // All Logic occurs at the presenter
                appPresenter.getAppDETAILS();
            }
        });
    }



    public MyModel GetAppFromModel(){
            return new MyModel("Frisbee APP", 9000000, 5); //object of mymodel
    }


   /* public void DisplayingAppinText(View view ){
        textView.setText(" APP name: "+GetAppFromModel().getAppName() +", Downloads: "+GetAppFromModel().appDownloads+", Rating:"+GetAppFromModel().apprating);

    }

    */




    @Override
    public void onGetAppName(String appname) {
    textView.setText(appname);
    }

   /* @Override
    public void onGetAppDownloads(int download) {
    textView.setText(download);
    }

    @Override
    public void onGetAppRating(int rating) {
   textView.setText(rating);
    }

    */
}