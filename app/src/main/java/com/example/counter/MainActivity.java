package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.counter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.upCounter.setOnClickListener(view -> plus());
        binding.downCounter.setOnClickListener(view -> minus());
    }

    private void minus() {
        int value = Integer.parseInt(binding.counterScreen.getText().toString());
        value --;
        if (value < 0) {
            value = 0;
        }
        binding.counterScreen.setText(Integer.toString(value));
    }

    private void plus() {
        int value = Integer.parseInt(binding.counterScreen.getText().toString());
        value ++;
        binding.counterScreen.setText(Integer.toString(value));
    }
}