package com.example.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    int Progress;
    private ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //clear tittle bar

        requestWindowFeature(Window.FEATURE_NO_TITLE);

        //remove notification bar

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
                );

        progressBar=findViewById(R.id.progressbarID);

        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
            }
        });

    }   public void doWork(){

        for (Progress=20; Progress<=100; Progress=Progress+20){

            try {
                Thread.sleep(1000);
                progressBar.setProgress(Progress);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }




    }



}