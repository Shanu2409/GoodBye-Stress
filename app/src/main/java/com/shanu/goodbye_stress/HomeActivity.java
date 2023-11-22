package com.shanu.goodbye_stress;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // get all the values from the layout
        FloatingActionButton waterButton = findViewById(R.id.water);
        FloatingActionButton mudraButton = findViewById(R.id.mudras);
        FloatingActionButton heartButton = findViewById(R.id.heart);

        // check if the current activity is HomeActivity then disable the heart button
        if (this.getClass().getSimpleName().equals("HomeActivity")) {
            heartButton.setEnabled(false);
        }

        // set the onClickListener for the water and mudra buttons
        waterButton.setOnClickListener(v -> {
            // create a new intent to open the WaterActivity
            Intent intent = new Intent(HomeActivity.this, WaterActivity.class);
            // start the activity
            startActivity(intent);
            finish();

        });

        mudraButton.setOnClickListener(v -> {
            // create a new intent to open the MudraActivity
            Intent intent = new Intent(HomeActivity.this, MudraActivity.class);
            // start the activity
            startActivity(intent);
            finish();
        });

    }
}