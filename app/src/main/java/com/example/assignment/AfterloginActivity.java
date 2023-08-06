package com.example.assignment;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.ktx.Firebase;

public class AfterloginActivity extends AppCompatActivity {
    Button btn;
    FirebaseAuth mauth;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afterlogin);
        txt=findViewById(R.id.textView);
        mauth= FirebaseAuth.getInstance();
        btn=findViewById(R.id.logout12);
        btn.setOnClickListener(view -> {
            startActivity(new Intent(AfterloginActivity.this,MainActivity.class));
            mauth.signOut();
        });
    }
}
