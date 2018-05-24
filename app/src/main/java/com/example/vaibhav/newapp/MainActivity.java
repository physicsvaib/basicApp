package com.example.vaibhav.newapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView img;
    private ImageView img2;
    @Override
    public void onCreate(Bundle setup){
        super.onCreate(setup);
        setContentView(R.layout.activity_main);
        img = (ImageView)findViewById(R.id.img);
        img2 = (ImageView)findViewById(R.id.ima2);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Second_Activity.class));
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Third_Activity.class));
            }
        });
    }


}
