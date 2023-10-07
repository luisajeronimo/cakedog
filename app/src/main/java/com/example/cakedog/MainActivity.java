package com.example.cakedog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imgCarroussel, imgCarroussel2, imgCarroussel3, imgCarroussel4, imgCarroussel5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgCarroussel = findViewById(R.id.logo);
        imgCarroussel.setImageResource(R.drawable.logo);

        imgCarroussel2 = findViewById(R.id.logo2);
        imgCarroussel2.setImageResource(R.drawable.logo2);

        //imgCarroussel3 = findViewById(R.id.imgCarroussel3);
        //imgCarroussel3.setImageResource(R.drawable.foto);

        //imgCarroussel4 = findViewById(R.id.imgCarroussel4);
        //imgCarroussel4.setImageResource(R.drawable.foto);

        //imgCarroussel5 = findViewById(R.id.imgCarroussel5);
        //imgCarroussel5.setImageResource(R.drawable.foto);
    }
}