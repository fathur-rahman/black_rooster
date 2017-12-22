package com.example.acer.spnj1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;

import static java.lang.Thread.sleep;

public class Splashscreen extends AppCompatActivity {

    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        splashscreen();
    }

    public void splashscreen() {
        logo = findViewById(R.id.logo);
        AlphaAnimation animation1 = new AlphaAnimation(0.0f, 1.0f);
        animation1.setDuration(1000);
        animation1.setStartOffset(1000);

        logo.startAnimation(animation1);

        Thread timerThread = new Thread() {
            public void run() {
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(Splashscreen.this, ProjectSpnj4.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();
    }
}

