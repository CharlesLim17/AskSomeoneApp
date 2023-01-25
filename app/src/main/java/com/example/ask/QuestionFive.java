package com.example.ask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

public class QuestionFive extends AppCompatActivity {

    int count = 1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_five);

        //action bar, navigation, status bar
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }

        //set variables
        CardView btnYes = findViewById(R.id.btnYes);
        CardView btnNo = findViewById(R.id.btnNo);

        //initiate loading dialog
        PopupDialog popupDialog = new PopupDialog(QuestionFive.this);

        btnYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(QuestionFive.this, "Ayoko mag on cam huhu", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(QuestionFive.this, FinalThoughts.class);
                startActivity(intent);
                finish();
            }
        });

        btnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count == 1){
                    popupDialog.startQ1Dialog1();;

                    //End Load Dialog
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            popupDialog.dismissDialog();
                        }
                    }, 3000);
                }
                else if (count == 2) {
                    popupDialog.startQ1Dialog2();;

                    //End Load Dialog
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            popupDialog.dismissDialog();
                        }
                    }, 3000);
                }
                else if (count == 3) {
                    popupDialog.startQ1Dialog3();;

                    //End Load Dialog
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            popupDialog.dismissDialog();
                        }
                    }, 3000);
                }
                else {
                    popupDialog.startQ1Dialog4();;

                    //End Load Dialog
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            popupDialog.dismissDialog();
                        }
                    }, 3000);
                }
                count++;
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(QuestionFive.this, QuestionFour.class);
        startActivity(intent);
        finish();
    }
}