package com.example.multiplication_problem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.multiplication_problem.databinding.ActivityMainBinding;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private Random random = new Random();
    private int answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        refreshQuiz();
        binding.buttonAnswer.setOnClickListener(v -> checkAnswer());
        binding.buttonRetry.setOnClickListener(v -> refreshQuiz());
    }

    private void refreshQuiz() {
        int left = random.nextInt(10) + 1;
        int right = random.nextInt(10 ) + 1;

        binding.numLeft.setText(Integer.toString(left));
        binding.numRight.setText(Integer.toString(right));
        binding.result.setText("");
        answer = left * right;
    }

    private void checkAnswer() {
        String string = binding.result.getText().toString();

        if (string.isEmpty()) {
            Toast.makeText(this, "정답을 입력해주세요.", Toast.LENGTH_SHORT).show();
            return;
        }

        int value = Integer.parseInt(string);
        if (value == answer) {
            Toast.makeText(this, "정답입니다!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "오답입니다. 다시 한 번 생각해보세요.", Toast.LENGTH_SHORT).show();
        }
    }


}