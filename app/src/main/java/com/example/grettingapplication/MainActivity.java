package com.example.grettingapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText userNameEditText;
    Button okButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.showTextView);
        userNameEditText=findViewById(R.id.useInputEditText);
        okButton=findViewById(R.id.okButton);
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //button on press method
                String nameString=userNameEditText.getText().toString();
                Intent intent=new Intent(MainActivity.this,LastActivity.class);
                intent.putExtra("personName",nameString);
                startActivity(intent);
            }
        });

    }
}