package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ActivityExample1Binding binidng;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.elmo);
        Toast.makeText(this, "안녕하세요 버튼 클릭입니다", Toast.LENGTH_LONG).show();
    }
}