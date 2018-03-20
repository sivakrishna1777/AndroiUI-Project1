package com.projects.siva.menubar;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    private static int TIME_OUT=4000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        //splash screen code

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splash = new Intent(Splash.this,MainActivity.class);
                startActivity(splash);
                finish();
            }
        },TIME_OUT);
    }
}
