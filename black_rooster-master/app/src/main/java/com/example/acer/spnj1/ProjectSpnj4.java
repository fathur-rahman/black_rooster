package com.example.acer.spnj1;

/**
 * Created by rizky.pratama98988 on 22/12/2017.
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ProjectSpnj4 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_spnj4);
    }

    public void order(View view) {
        Intent a = new Intent(ProjectSpnj4.this,ProjectSpnj6.class);
        startActivity(a);
    }

    public void list(View view) {
        Intent intent = new Intent(ProjectSpnj4.this,ProjectSpnj5.class);
        startActivity(intent);
    }

    public void search(View view) {
        Intent b = new Intent(ProjectSpnj4.this,ProjectSpnj7.class);
        startActivity(b);
    }

    public void exit(View view) {
        finish();
    };

    public void sign_in(View view) {
        Intent c = new Intent(ProjectSpnj4.this,Sign_in.class);
        startActivity(c);
    }

    public void sign_up(View view) {
        Intent d = new Intent(ProjectSpnj4.this,sign_up.class);
        startActivity(d);
    }

    public void form(View view) {
        Intent e = new Intent(ProjectSpnj4.this,formulir.class);
        startActivity(e);
    }

    public void lv(View view) {
        Intent f = new Intent(ProjectSpnj4.this,activity_13.class);
        startActivity(f);
    }
}
