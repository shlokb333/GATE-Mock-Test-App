package com.example.gatemocktest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Result_Algo extends AppCompatActivity {
    private TextView resultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_algo);
        resultText = findViewById(R.id.resultText);
        resultText.setText("Result :" + Algo_Activity.score +"/ 10");
    }
}