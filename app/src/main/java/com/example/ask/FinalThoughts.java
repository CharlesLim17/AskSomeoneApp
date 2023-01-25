package com.example.ask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class FinalThoughts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_thoughts);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(FinalThoughts.this, QuestionFive.class);
        startActivity(intent);
        finish();
    }
}