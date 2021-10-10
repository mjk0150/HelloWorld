package com.example.easy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.easy.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Log.i("김민정", "onCreate 실행합니다.");

        binding.button1.setOnClickListener(v -> printlog("버튼1 클릭 했습니다."));
        binding.button2.setOnClickListener(v -> printlog("버튼2도 클랙 했습니다."));
        binding.button3.setOnClickListener(v -> printlog("버튼3 ㅋㅋㅋㅋ"));
        binding.button4.setOnClickListener(v -> printlog("버튼4 즐겁다."));
        binding.centerButton.setOnClickListener(v -> {
            Log.i("김민정", "텍스트뷰 내용: " + binding.textView.getText());
            Log.i("김민정", "에디트 텍스트 내용" + binding.edit.getText());
        });
    }

    private void printlog(String s) {
        Log.i("김민정", s);
    }


}