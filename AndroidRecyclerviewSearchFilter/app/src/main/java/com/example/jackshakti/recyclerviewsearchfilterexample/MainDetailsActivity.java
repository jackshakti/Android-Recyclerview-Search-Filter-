package com.example.jackshakti.recyclerviewsearchfilterexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_deatil);


        TextView textView = findViewById(R.id.textview);

        // getting data from the main Activity
        Intent intent = getIntent();
        String feedbackUrl = intent.getStringExtra("INTENT-URL");


        textView.setText(feedbackUrl);



    }

    }
