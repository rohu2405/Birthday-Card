package com.jr.birthdaywishingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class BirthdayGreeting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday_greeting);
        Intent intent = getIntent();
        String name = intent.getExtras().getString("key");
        TextView text = findViewById(R.id.textView2);
        text.setText( " Wishing You A Very Happy Birthday \n "+name + " :) ");














    }
}

/**
 *  public String RSSFEEDOFCHOICE;
 *     public final String tag = "RSSReader";
 *     private RSSFed feed = null;
 *
 *     /** Called when the activity is first created. */

//         *public void onCreate(Bundle abc){
//        *super.onCreate(abc);
//        *setContentView(R.layout.next1);
//        *
//        *Intent i=getIntent();
//        *RSSFEEDOFCHOICE=i.getStringExtra("key");
//        *
//        *         // go get our feed!
//        *feed=getFeed(RSSFEEDOFCHOICE);
//        *
//        *         // display UI
//        *UpdateDisplay();
// */