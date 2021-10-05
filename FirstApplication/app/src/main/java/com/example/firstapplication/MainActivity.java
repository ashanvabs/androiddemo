package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
   final static String MESSAGE_TEXT="message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void send(View view){
        Intent intent=new Intent(this,ViewMessageActivity.class);
        EditText editText=findViewById(R.id.editTextTextPersonName);
        String message=editText.getText().toString() ;
        intent.putExtra(MainActivity.MESSAGE_TEXT,message);
        startActivity(intent);
    }
}