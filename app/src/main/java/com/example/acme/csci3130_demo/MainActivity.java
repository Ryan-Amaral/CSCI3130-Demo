package com.example.acme.csci3130_demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void updateText(android.view.View v){
        ((TextView)findViewById(R.id.text_view)).setText(
                ((EditText)findViewById(R.id.text_input)).getText());
    }
}
