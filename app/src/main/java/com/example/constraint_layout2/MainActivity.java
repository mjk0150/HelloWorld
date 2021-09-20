package com.example.constraint_layout2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.constraint_layout2.databinding.ActivityExample1Binding;

public class MainActivity extends AppCompatActivity {
    private ActivityExample1Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityExample1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}