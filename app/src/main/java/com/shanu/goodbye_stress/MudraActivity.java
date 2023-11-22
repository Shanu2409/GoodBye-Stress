package com.shanu.goodbye_stress;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MudraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mudra);

        FloatingActionButton waterButton = findViewById(R.id.water);
        FloatingActionButton mudraButton = findViewById(R.id.mudras);
        FloatingActionButton heartButton = findViewById(R.id.heart);

        // check if the current activity is HomeActivity then disable the heart button
        if (this.getClass().getSimpleName().equals("MudraActivity")) {
            mudraButton.setEnabled(false);
        }

        // set the onClickListener for the heart and water buttons

        heartButton.setOnClickListener(v -> {
            // create a new intent to open the HomeActivity
            Intent intent = new Intent(MudraActivity.this, HomeActivity.class);
            // start the activity
            startActivity(intent);
            finish();
        });

        waterButton.setOnClickListener(v -> {
            // create a new intent to open the WaterActivity
            Intent intent = new Intent(MudraActivity.this, WaterActivity.class);
            // start the activity
            startActivity(intent);
            finish();

        });
    }
}