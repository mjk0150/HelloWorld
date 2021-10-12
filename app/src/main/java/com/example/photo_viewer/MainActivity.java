package com.example.photo_viewer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.photo_viewer.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.random2.setOnClickListener(v -> binding.imagePopup.setImageResource(R.drawable.lee));
        binding.random1.setOnClickListener(v -> binding.imagePopup.setImageResource(R.drawable.younghee));
        binding.random3.setOnClickListener(v -> binding.imagePopup.setImageResource(R.drawable.squid_game));
    }
}