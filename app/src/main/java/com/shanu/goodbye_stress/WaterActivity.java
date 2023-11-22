package com.shanu.goodbye_stress;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class WaterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water);

        FloatingActionButton waterButton = findViewById(R.id.water);
        FloatingActionButton mudraButton = findViewById(R.id.mudras);
        FloatingActionButton heartButton = findViewById(R.id.heart);

        // check if the current activity is HomeActivity then disable the heart button
        if (this.getClass().getSimpleName().equals("WaterActivity")) {
            waterButton.setEnabled(false);
        }

        // set the onClickListener for the heart and mudra buttons
        heartButton.setOnClickListener(v -> {
            // create a new intent to open the HomeActivity
            Intent intent = new Intent(WaterActivity.this, HomeActivity.class);
            // start the activity
            startActivity(intent);
            finish();
        });

        mudraButton.setOnClickListener(v -> {
            // create a new intent to open the MudraActivity
            Intent intent = new Intent(WaterActivity.this, MudraActivity.class);
            // start the activity
            startActivity(intent);
            finish();
        });
    }
}