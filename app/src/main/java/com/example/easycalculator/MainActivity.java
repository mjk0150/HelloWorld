package com.example.easycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Toast;

import com.example.easycalculator.databinding.ActivityMainBinding;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private Operation selectedOp;
    enum Operation {
        ADD, DIVIDE, MULTIPLY, SUBTRACT
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.buttonEnter.setOnClickListener(view -> calculate());
        binding.buttonAdd.setOnClickListener(view -> {
                binding.operator.setText("+");
                selectedOp = Operation.ADD;
        });
        binding.buttonSubtract.setOnClickListener(view -> {
            binding.operator.setText("-");
            selectedOp = Operation.SUBTRACT;
        });
        binding.buttonMultiply.setOnClickListener(view -> {
            binding.operator.setText("*");
            selectedOp = Operation.MULTIPLY;
        });
        binding.buttonDivide.setOnClickListener(view -> {
            binding.operator.setText("/");
            selectedOp = Operation.DIVIDE;
        });
    }


    @SuppressLint("SetTextI18n")
    private void calculate() {
        String leftValue = binding.editLeft.getText().toString();
        String rightValue = binding.editRight.getText().toString();

        if (leftValue.isEmpty() || rightValue.isEmpty()) {
            Toast.makeText(this, "숫자를 입력해주세요", Toast.LENGTH_SHORT).show();
        } else {
            float left = Float.parseFloat(leftValue);
            float right = Float.parseFloat(rightValue);
            float result = 0;
            switch (selectedOp) {
                case ADD:
                    result = left + right;
                    break;

                case SUBTRACT:
                    result = left - right;
                    break;

                case MULTIPLY:
                    result = left * right;
                    break;

                case DIVIDE:
                    if (right == 0) {
                        binding.result.setText("error");
                        return;
                    }
                    result = left / right;
                    break;

            }

                DecimalFormat formatter = new DecimalFormat("#.##");
                binding.result.setText(formatter.format(result));

        }

    }
}