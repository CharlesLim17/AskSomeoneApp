package com.example.ask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class Page2 extends AppCompatActivity {

    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        //action bar, navigation, status bar
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }

        AppCompatButton btnNext = findViewById(R.id.btnNext);
        radioButton = findViewById(R.id.radioButton);

        //button onclick with validation
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (error()){
                    Toast.makeText(Page2.this, "landi mo ha xD", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(Page2.this, Page3.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }

    //function for checkbox validation
    private boolean error(){
        if (!radioButton.isChecked()){
            Toast.makeText(Page2.this, "Accept mo hoy!", Toast.LENGTH_LONG).show();
            return false;
        }
        return true;
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Page2.this, Page1.class);
        startActivity(intent);
        finish();
    }
}