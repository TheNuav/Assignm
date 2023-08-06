package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button s;
    Button l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s=findViewById(R.id.signup);
        l=findViewById(R.id.login);
        s.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this,SignupActivity.class));
        });
        l.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this,LoginActivity.class));
        });

    }
}