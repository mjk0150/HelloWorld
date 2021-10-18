package com.example.practice1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;

import com.example.practice1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.button.setOnClickListener(v -> {
           ConstraintLayout.LayoutParams param = (ConstraintLayout.LayoutParams) binding.image.getLayoutParams();
           //ConstraintLayout.LayoutParams is a class; param is a variable
            // () enables the view binding.image to be revised in java.file.
            param.height = dp2pixel(500);
            binding.image.setLayoutParams(param);
        });
    }

    private int dp2pixel(float dp) {
        return (int) (dp * getResources().getDisplayMetrics().density);
    }
}