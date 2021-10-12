package com.example.countdown;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.countdown.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    private int count = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.buttonCountdown.setOnClickListener(v -> countDown());
    }

    private void countDown() {
        count--;

        if (count == 0) {
            binding.boomMessage.setVisibility(View.GONE);
            binding.imageBoom.setVisibility(View.VISIBLE);
            binding.buttonCountdown.setVisibility(View.GONE);
            return;
        }

        String message = String.format("%d번만 더 눌러보세요 \uD83E\uDD2A", count);
        binding.boomMessage.setText(message);
    }
}