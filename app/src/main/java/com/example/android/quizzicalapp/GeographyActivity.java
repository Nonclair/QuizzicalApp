package com.example.android.quizzicalapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewFlipper;

import java.util.Random;

public class GeographyActivity extends AppCompatActivity {

    Button gq1c1,gq1c2,gq1c3,gq2c1,gq2c2,gq2c3,gq3c1,gq3c2,gq3c3,gq4c1,gq4c2,gq4c3,gq5c1,gq5c2,gq5c3,btn;

    double score = 0;
    int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geography);

        gq1c1 = (Button) findViewById(R.id.geography_question1_choice1);
        gq1c2 = (Button) findViewById(R.id.geography_question1_choice2);
        gq1c3 = (Button) findViewById(R.id.geography_question1_choice3);
        gq2c1 = (Button) findViewById(R.id.geography_question2_choice4);
        gq2c2 = (Button) findViewById(R.id.geography_question2_choice5);
        gq2c3 = (Button) findViewById(R.id.geography_question2_choice6);
        gq3c1 = (Button) findViewById(R.id.geography_question3_choice7);
        gq3c2 = (Button) findViewById(R.id.geography_question3_choice8);
        gq3c3 = (Button) findViewById(R.id.geography_question3_choice9);
        gq4c1 = (Button) findViewById(R.id.geography_question4_choice10);
        gq4c2 = (Button) findViewById(R.id.geography_question4_choice11);
        gq4c3 = (Button) findViewById(R.id.geography_question4_choice12);
        gq5c1 = (Button) findViewById(R.id.geography_question5_choice13);
        gq5c2 = (Button) findViewById(R.id.geography_question5_choice14);
        gq5c3 = (Button) findViewById(R.id.geography_question5_choice15);
        btn = (Button) findViewById(R.id.button);
        final ViewFlipper viewFlipper= (ViewFlipper) findViewById(R.id.geography_view_flipper);

        gq1c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gq1c1.setBackgroundColor(Color.GRAY);
                gq1c1.setEnabled(false);
            }
        });
        gq1c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gq1c2.setBackgroundColor(Color.GRAY);
                gq1c2.setEnabled(false);
            }
        });

        gq1c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                score++;
                gq1c3.setBackgroundColor(Color.GRAY);
                gq1c3.setEnabled(false);
            }
        });

        gq2c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gq2c1.setBackgroundColor(Color.GRAY);
                gq2c1.setEnabled(false);
            }
        });

        gq2c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                score++;
                gq2c2.setBackgroundColor(Color.GRAY);
                gq2c2.setEnabled(false);
            }
        });

        gq2c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gq2c3.setBackgroundColor(Color.GRAY);
                gq2c3.setEnabled(false);
            }
        });


        gq3c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                score++;
                gq3c1.setBackgroundColor(Color.GRAY);
                gq3c1.setEnabled(false);

            }
        });

        gq3c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gq3c2.setBackgroundColor(Color.GRAY);
                gq3c2.setEnabled(false);

            }
        });

        gq3c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gq3c3.setBackgroundColor(Color.GRAY);
                gq3c3.setEnabled(false);

            }
        });

        gq4c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gq4c1.setBackgroundColor(Color.GRAY);
                gq4c1.setEnabled(false);

            }
        });

        gq4c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                score++;
                gq4c2.setBackgroundColor(Color.GRAY);
                gq4c2.setEnabled(false);

            }
        });

        gq4c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gq4c3.setBackgroundColor(Color.GRAY);
                gq4c3.setEnabled(false);

            }
        });


        gq5c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gq5c1.setBackgroundColor(Color.GRAY);
                gq5c1.setEnabled(false);
                btn.setText("Submit");

            }
        });

        gq5c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gq5c2.setBackgroundColor(Color.GRAY);
                gq5c2.setEnabled(false);
                btn.setText("Submit");

            }
        });

        gq5c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                score++;
                gq5c3.setBackgroundColor(Color.GRAY);
                gq5c3.setEnabled(false);
                btn.setText("Submit");

            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                if (count <= 4){
                    viewFlipper.showNext();
                }
                else{
                    viewFlipper.stopFlipping();

                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                           GeographyActivity.this);

                    // set title
                    alertDialogBuilder.setTitle("Your Title");

                    // set dialog message
                    alertDialogBuilder
                            .setMessage("Score is " + (int)((score/5)*100) +"%")
                            .setCancelable(false)
                            .setPositiveButton("Exit",new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    // if this button is clicked, close
                                    // current activity
                                    GeographyActivity.this.finish();
                                }
                            })
                            .setNegativeButton("Try Again",new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    // if this button is clicked, just close
                                    // the dialog box and do nothing
                                    dialog.cancel();
                                    GeographyActivity.this.recreate();

                                }
                            });

                    // create alert dialog
                    AlertDialog alertDialog = alertDialogBuilder.create();

                    // show it
                    alertDialog.show();
                }

            }
        });


    }
}
