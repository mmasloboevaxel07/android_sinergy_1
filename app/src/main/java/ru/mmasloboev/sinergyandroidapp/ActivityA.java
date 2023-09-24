package ru.mmasloboev.sinergyandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        Button button = findViewById(R.id.btOpenActB);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(this, ActivityB.class);
            startActivity(intent);
        });
    }
}