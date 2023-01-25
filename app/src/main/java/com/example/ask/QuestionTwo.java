package com.example.ask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import java.util.ArrayList;

public class QuestionTwo extends AppCompatActivity {

    ViewPager2 viewPager2;
    ArrayList<ViewPagerItem> viewPagerItemArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_two);

        //action bar, navigation, status bar
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }

        //set variables
        viewPager2 = findViewById(R.id.viewpager);
        int[] images = {R.drawable.movie_deleter, R.drawable.movie_theboyinthedark, R.drawable.movie_megan,
                R.drawable.movie_familymatters, R.drawable.movie_avatar, R.drawable.movie_labyuwithanaccent,
                R.drawable.movie_partnersincrime, R.drawable.movie_triangleofsadness, R.drawable.movie_iwannadancewithsomebody};
        String[] heading = {"Deleter", "The Boy in the Dark", "M3GAN", "Family Matters",
                "Avatar: The Way of Water", "Labyu with an Accent", "Partners in Crime", "Triangle of Sadness" , "Wanna Dance With Somebody"};
        String [] description = {"Kunwari description. Anyways gagi naur ba ito? If you want to patunayan na mali yung bash nila dito then choose this up to you really.",
                "Horror daw siyaa, idk kung totoong katakot. Lol na alala ko tuloy yung pinanood natin na kdrama sa discord. Please no horror mawawala angas ko. 2.3 rating siye",
                "Horror again, mas mataas rating niya kaysa dun sa boy in the dark. 3.7 rating. Again please no horror thank you",
                "Drama daw itey. Tear jerking daw beh oh my god kaso filipino film hilig ka pa don? netflix filipino films lang the best. 4.5 rating",
                "Pwede siya pang IG story. Clout chasing tayo dito pero fr maganda to, pero have you watched the first one ba? Anyways rating is 4.9 taas gagi",
                "RomCom genre well nothing can go wrong naman with romcoms si ano to coco martin at judy anne ata idk filipina actresses, Rating is 3.3",
                "Comedy. No need ko na to describe kita mo naman si Vice Ganda sa poster hahahaha. 3.5 rating",
                "Comedy and Drama daw, pwede ba yon comedy tas drama. Parang sinabihan mo kong huy yoko sayo, charoooot lang pala HAHAHAH. 4.3 rating.",
                "Drama, history, music. To be honest di ko siya alam basta si whitney houston siya. No rating lol baka bago."};

        viewPagerItemArrayList = new ArrayList<>();

        for (int i = 0; i < images.length; i++){
            ViewPagerItem viewPagerItem = new ViewPagerItem(images[i], heading[i], description[i]);
            viewPagerItemArrayList.add(viewPagerItem);
        }

        VPAdapter vpAdapter = new VPAdapter(viewPagerItemArrayList);

        viewPager2.setAdapter(vpAdapter);
        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setOffscreenPageLimit(2);
        viewPager2.getChildAt(0).setOverScrollMode(View.OVER_SCROLL_NEVER);

        //btn onclick
        ImageView btnCheck = findViewById(R.id.btnCheck);
        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuestionTwo.this, QuestionThree.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(QuestionTwo.this, QuestionOne.class);
        startActivity(intent);
        finish();
    }
}