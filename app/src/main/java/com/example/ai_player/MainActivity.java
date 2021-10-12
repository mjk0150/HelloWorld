package com.example.ai_player;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.ai_player.databinding.ActivityMainBinding;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    private final Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.buttonPaper.setOnClickListener(v -> game("보"));
        binding.buttonRock.setOnClickListener(v -> game("바위"));
        binding.buttonSci.setOnClickListener(v -> game("가위"));
    }

    private void game(String yourchoice) {
        int ai = random.nextInt(3);
        String aiChoice;
        switch (ai) {
            case 0:
                aiChoice = "가위";
                break;

            case 1:
                aiChoice = "바위";
                break;

            default:
                aiChoice = "보";
        }

        binding.message1.setText("AI가 " + aiChoice + "를 냈습니다.");
        binding.message2.setText("당신은 " + yourchoice + "를 냈습니다.");

        String result;

        if (aiChoice.equals(yourchoice)) {
            result = "비겼습니다!\uD83D\uDE42";
        } else if ((aiChoice.equals("가위") && yourchoice.equals("바위")) ||
                (aiChoice.equals("바위") && yourchoice.equals("보")) ||
                (aiChoice.equals("보") && yourchoice.equals("가위"))) {
            result = "축하합니다. \uD83D\uDE04 당신이 이겼습니다.";
        } else {
            result = "미안합니다. \uD83D\uDE1D 당신이 졌습니다.";
        }
        binding.message3.setText(result);
    }
}