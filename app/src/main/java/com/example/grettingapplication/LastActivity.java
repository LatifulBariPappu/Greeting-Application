package com.example.grettingapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LastActivity extends AppCompatActivity {

    TextView finalTextView;
    Button exitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);

        finalTextView=findViewById(R.id.finalTextView);
        exitButton=findViewById(R.id.exitButton);
        finalTextView.setText("Welcome!!\n"+getIntent().getStringExtra("personName"));
        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LastActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}