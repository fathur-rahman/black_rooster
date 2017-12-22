package com.example.acer.spnj1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Sign_in extends AppCompatActivity {

    TextView signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }

    public void onClick (){
        signUp = (TextView) findViewById(R.id.signu);
        signUp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Sign_in.this,sign_up.class);
                startActivity(intent);
            }
        });
    }

    public void menu(View view) {
        Intent intent = new Intent(Sign_in.this, ProjectSpnj4.class);
        startActivity(intent);
    }
}


