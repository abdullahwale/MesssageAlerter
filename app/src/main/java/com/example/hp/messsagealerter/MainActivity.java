package com.example.hp.messsagealerter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.tapadoo.alerter.Alert;
import com.tapadoo.alerter.Alerter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void showAlerter(View v){
        Alerter.create(this)
                .setTitle("My Custom Alert Title")
                .setText("Close YOur Appliaction")
                .show();


    }
}
