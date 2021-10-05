package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ViewMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_message);
        String message=getIntent().getStringExtra(MainActivity.MESSAGE_TEXT);
        //
        TextView textView= findViewById(R.id.textView);
        textView.setText(message);


    }
}