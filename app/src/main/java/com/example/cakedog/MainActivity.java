package com.example.cakedog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imgCarroussel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        imgCarroussel = findViewById(R.id.imgCarroussel);
        imgCarroussel.setImageResource(R.drawable.foto);
    }
}