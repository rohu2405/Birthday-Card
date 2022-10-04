package com.jr.birthdaywishingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void create(View view) {
        EditText nameInput = findViewById(R.id.editTextTextPersonName);
        String text= nameInput.getText().toString();
        Intent intent = new Intent(MainActivity.this , BirthdayGreeting.class);
        intent.putExtra ( "key", text );
        startActivity(intent);
    }
}

