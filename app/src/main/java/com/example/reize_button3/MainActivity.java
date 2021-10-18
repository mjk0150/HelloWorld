package com.example.reize_button3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;

import com.example.reize_button3.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.button100.setOnClickListener(this::buttonEvent);
        binding.button200.setOnClickListener(this::buttonEvent);
        binding.button400.setOnClickListener(this::buttonEvent);
    }

    private void enableAll() {
        binding.button200.setEnabled(true);
        binding.button100.setEnabled(true);
        binding.button400.setEnabled(true);
    }

    private void buttonEvent(View v) {
        enableAll();
        v.setEnabled(false); //button not enabled to press
        int newHeight = 0;

        switch (v.getId()) {
            case R.id.button100:
                newHeight = 100;
                break;

            case R.id.button200:
                newHeight = 200;
                break;

            case R.id.button400:
                newHeight = 400;
                break;
        }

        setImageHeight(newHeight);
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