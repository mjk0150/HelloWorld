package com.example.fortune_count;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.fortune_count.databinding.ActivityMainBinding;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    private boolean checked = false;
    private final Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.button.setOnClickListener(v -> {
            if (checked) {
                Toast.makeText(this, "한 번만 할 수 있지롱 \uD83D\uDE1B", Toast.LENGTH_SHORT).show();
                return;
            }
            checked = true;
            // 0에서 100점
            int score = random.nextInt(101); //bound is exclusive
            binding.score.setText(String.format("%d점", score));
        });
    }

}