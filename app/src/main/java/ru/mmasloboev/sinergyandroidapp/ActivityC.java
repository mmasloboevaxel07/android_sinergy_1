package ru.mmasloboev.sinergyandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ActivityC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        Button buttonToA = findViewById(R.id.btOpenActA);
        buttonToA.setOnClickListener(view -> {
            Intent intent = new Intent(this, ActivityA.class);
            startActivity(intent);
        });

        Button buttonToD = findViewById(R.id.btOpenActD);
        buttonToD.setOnClickListener(view -> {
            Intent intent = new Intent(this, ActivityD.class);
            startActivity(intent);
        });

        Button buttonClose = findViewById(R.id.btCloseActC);
        buttonClose.setOnClickListener(view -> {
            Intent intent = new Intent(this, ActivityB.class);
            startActivity(intent);
        });

        Button buttonCloseStack = findViewById(R.id.btCloseStack);
        buttonCloseStack.setOnClickListener(view -> {
            finishAffinity();
        });

    }
}