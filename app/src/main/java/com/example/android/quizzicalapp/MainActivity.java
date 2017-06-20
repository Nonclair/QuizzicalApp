package com.example.android.quizzicalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button geoBtn,sciBtn,ecoBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    public void init() {
        geoBtn = (Button) findViewById(R.id.geographyBtn);
        geoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GeographyActivity.class);
                startActivity(intent);
            }
        });

        sciBtn = (Button) findViewById(R.id.scienceBtn);
        sciBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ScienceActivity.class);
                startActivity(intent);
            }
        });

        ecoBtn = (Button) findViewById(R.id.economicsBtn);
        ecoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EconomicsActivity.class);
                startActivity(intent);
            }
        });
    }
    }

