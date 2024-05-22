package com.example.icytoppings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Objects;

public class AboutActivity extends AppCompatActivity {

    TextView tvAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Objects.requireNonNull(getSupportActionBar()).setTitle("About");

        tvAbout = findViewById(R.id.tvAbout);

        String abt = "project manager:-\n\n1. Said AlNaimi 202221106";
        tvAbout.setText(abt);

    }
}
