package com.example.ntomsum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.ntomsum.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.buttonCalc.setOnClickListener(v -> sum());
    }

    private void sum() {
        String start = binding.editStart.getText().toString();
        String end = binding.editEnd.getText().toString();

        if (start.isEmpty() || end.isEmpty()) {
            Toast.makeText(this, "숫자를 입력해주세요.", Toast.LENGTH_SHORT).show();
            return;
        }

        int startValue = Integer.parseInt(start);
        int endValue = Integer.parseInt(end);

        if (startValue > endValue) {
            Toast.makeText(this, "시작값은 종료값보다 작거나 같아야 합니다.", Toast.LENGTH_SHORT).show();
            return;
        }

        int sum = 0;
        for (int i = startValue; i <= endValue; i++) {
            sum += i;
        }
        binding.result.setText(Integer.toString(sum));
        binding.result.setVisibility(View.VISIBLE);
        binding.sumMessage.setText(String.format("%d부터 %d까지의 합은", startValue, endValue));
        binding.sumMessage.setVisibility(View.VISIBLE);
    }

}