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
import java.util.concurrent.Phaser;

public class ScienceActivity extends AppCompatActivity {

    Button sq1c1,sq1c2,sq1c3,sq2c1,sq2c2,sq2c3,sq3c1,sq3c2,sq3c3,sq4c1,sq4c2,sq4c3,sq5c1,sq5c2,sq5c3,btn;

    double score = 0;
    int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science);

        sq1c1 = (Button) findViewById(R.id.science_question1_choice1);
        sq1c2 = (Button) findViewById(R.id.science_question1_choice2);
        sq1c3 = (Button) findViewById(R.id.science_question1_choice3);
        sq2c1 = (Button) findViewById(R.id.science_question2_choice4);
        sq2c2 = (Button) findViewById(R.id.science_question2_choice5);
        sq2c3 = (Button) findViewById(R.id.science_question2_choice6);
        sq3c1 = (Button) findViewById(R.id.science_question3_choice7);
        sq3c2 = (Button) findViewById(R.id.science_question3_choice8);
        sq3c3 = (Button) findViewById(R.id.science_question3_choice9);
        sq4c1 = (Button) findViewById(R.id.science_question4_choice10);
        sq4c2 = (Button) findViewById(R.id.science_question4_choice11);
        sq4c3 = (Button) findViewById(R.id.science_question4_choice12);
        sq5c1 = (Button) findViewById(R.id.science_question5_choice13);
        sq5c2 = (Button) findViewById(R.id.science_question5_choice14);
        sq5c3 = (Button) findViewById(R.id.science_question5_choice15);
        btn = (Button) findViewById(R.id.button);
        final ViewFlipper viewFlipper= (ViewFlipper) findViewById(R.id.science_view_flipper);

        sq1c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sq1c1.setBackgroundColor(Color.GRAY);
                sq1c1.setEnabled(false);
            }
        });
        sq1c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sq1c2.setBackgroundColor(Color.GRAY);
                sq1c2.setEnabled(false);
            }
        });

        sq1c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                score++;
                sq1c3.setBackgroundColor(Color.GRAY);
                sq1c3.setEnabled(false);
            }
        });

        sq2c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                score++;
                sq2c1.setBackgroundColor(Color.GRAY);
                sq2c1.setEnabled(false);
            }
        });

        sq2c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sq2c2.setBackgroundColor(Color.GRAY);
                sq2c2.setEnabled(false);
            }
        });

        sq2c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sq2c3.setBackgroundColor(Color.GRAY);
                sq2c3.setEnabled(false);
            }
        });


        sq3c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sq3c1.setBackgroundColor(Color.GRAY);
                sq3c1.setEnabled(false);

            }
        });

        sq3c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sq3c2.setBackgroundColor(Color.GRAY);
                sq3c2.setEnabled(false);

            }
        });

        sq3c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                score++;
                sq3c3.setBackgroundColor(Color.GRAY);
                sq3c3.setEnabled(false);

            }
        });

        sq4c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sq4c1.setBackgroundColor(Color.GRAY);
                sq4c1.setEnabled(false);

            }
        });

        sq4c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                score++;
                sq4c2.setBackgroundColor(Color.GRAY);
                sq4c2.setEnabled(false);

            }
        });

        sq4c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sq4c3.setBackgroundColor(Color.GRAY);
                sq4c3.setEnabled(false);

            }
        });


        sq5c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sq5c1.setBackgroundColor(Color.GRAY);
                sq5c1.setEnabled(false);
                btn.setText("Submit");

            }
        });

        sq5c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                score++;
                sq5c2.setBackgroundColor(Color.GRAY);
                sq5c2.setEnabled(false);
                btn.setText("Submit");

            }
        });

        sq5c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sq5c3.setBackgroundColor(Color.GRAY);
                sq5c3.setEnabled(false);
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
                         ScienceActivity.this);

                 // set title
                 alertDialogBuilder.setTitle("Your Score");

                 // set dialog message
                 alertDialogBuilder
                         .setMessage(" Is " + (int)((score/5)*100) + "%")
                         .setCancelable(false)
                         .setPositiveButton("Exit",new DialogInterface.OnClickListener() {
                             public void onClick(DialogInterface dialog,int id) {
                                 // if this button is clicked, close
                                 // current activity
                                 ScienceActivity.this.finish();
                             }
                         })
                         .setNegativeButton("Try Again",new DialogInterface.OnClickListener() {
                             public void onClick(DialogInterface dialog,int id) {
                                 // if this button is clicked, just close
                                 // the dialog box and do nothing
                                 dialog.cancel();
                                 ScienceActivity.this.recreate();

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

