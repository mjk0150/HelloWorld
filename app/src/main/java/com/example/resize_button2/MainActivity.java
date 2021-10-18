package com.example.resize_button2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.os.Bundle;

import com.example.resize_button2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.button100.setOnClickListener(v -> setImageHeight(100));
        binding.button200.setOnClickListener(v -> setImageHeight(200));
        binding.button400.setOnClickListener(v -> setImageHeight(400));

    }

    private void setImageHeight(float newHeight) {
        ConstraintLayout.LayoutParams param = (ConstraintLayout.LayoutParams) binding.image.getLayoutParams();
        param.height = dp2pixel(newHeight);
        binding.image.setLayoutParams(param);
    }

    private int dp2pixel(float dp) {
        return (int) (dp * getResources().getDisplayMetrics().density);
    }
}