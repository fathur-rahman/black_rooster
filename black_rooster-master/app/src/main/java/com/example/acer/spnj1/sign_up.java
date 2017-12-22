package com.example.acer.spnj1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class sign_up extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void menu(View view) {
        Intent intent = new Intent(sign_up.this, ProjectSpnj4.class);
        startActivity(intent);
    }
}
