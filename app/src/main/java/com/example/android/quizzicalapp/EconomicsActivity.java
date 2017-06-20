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


public class EconomicsActivity extends AppCompatActivity {
    Button eq1c1,eq1c2,eq1c3,eq2c1,eq2c2,eq2c3,eq3c1,eq3c2,eq3c3,eq4c1,eq4c2,eq4c3,eq5c1,eq5c2,eq5c3,btn;

    double score = 0;
    int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_economics);

        eq1c1 = (Button) findViewById(R.id.economics_question1_choice1);
        eq1c2 = (Button) findViewById(R.id.economics_question1_choice2);
        eq1c3 = (Button) findViewById(R.id.economics_question1_choice3);
        eq2c1 = (Button) findViewById(R.id.economics_question2_choice4);
        eq2c2 = (Button) findViewById(R.id.economics_question2_choice5);
        eq2c3 = (Button) findViewById(R.id.economics_question2_choice6);
        eq3c1 = (Button) findViewById(R.id.economics_question3_choice7);
        eq3c2 = (Button) findViewById(R.id.economics_question3_choice8);
        eq3c3 = (Button) findViewById(R.id.economics_question3_choice9);
        eq4c1 = (Button) findViewById(R.id.economics_question4_choice10);
        eq4c2 = (Button) findViewById(R.id.economics_question4_choice11);
        eq4c3 = (Button) findViewById(R.id.economics_question4_choice12);
        eq5c1 = (Button) findViewById(R.id.economics_question5_choice13);
        eq5c2 = (Button) findViewById(R.id.economics_question5_choice14);
        eq5c3 = (Button) findViewById(R.id.economics_question5_choice15);
        btn = (Button) findViewById(R.id.button);
        final ViewFlipper viewFlipper= (ViewFlipper) findViewById(R.id.economics_view_flipper);

        eq1c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                eq1c1.setBackgroundColor(Color.GRAY);
                eq1c1.setEnabled(false);
            }
        });
        eq1c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                eq1c2.setBackgroundColor(Color.GRAY);
                eq1c2.setEnabled(false);
            }
        });

        eq1c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                score++;
                eq1c3.setBackgroundColor(Color.GRAY);
                eq1c3.setEnabled(false);
            }
        });

        eq2c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                score++;
                eq2c1.setBackgroundColor(Color.GRAY);
                eq2c1.setEnabled(false);
            }
        });

        eq2c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                eq2c2.setBackgroundColor(Color.GRAY);
                eq2c2.setEnabled(false);
            }
        });

        eq2c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                eq2c3.setBackgroundColor(Color.GRAY);
                eq2c3.setEnabled(false);
            }
        });


        eq3c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                eq3c1.setBackgroundColor(Color.GRAY);
                eq3c1.setEnabled(false);

            }
        });

        eq3c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                score++;
                eq3c2.setBackgroundColor(Color.GRAY);
                eq3c2.setEnabled(false);

            }
        });

        eq3c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                eq3c3.setBackgroundColor(Color.GRAY);
                eq3c3.setEnabled(false);

            }
        });

        eq4c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                score++;
                eq4c1.setBackgroundColor(Color.GRAY);
                eq4c1.setEnabled(false);

            }
        });

        eq4c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                eq4c2.setBackgroundColor(Color.GRAY);
                eq4c2.setEnabled(false);

            }
        });

        eq4c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                eq4c3.setBackgroundColor(Color.GRAY);
                eq4c3.setEnabled(false);

            }
        });


        eq5c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                eq5c1.setBackgroundColor(Color.GRAY);
                eq5c1.setEnabled(false);
                btn.setText("Submit");

            }
        });

        eq5c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                score++;
                eq5c2.setBackgroundColor(Color.GRAY);
                eq5c2.setEnabled(false);
                btn.setText("Submit");

            }
        });

        eq5c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                eq5c3.setBackgroundColor(Color.GRAY);
                eq5c3.setEnabled(false);
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
                            EconomicsActivity.this);

                    // set title
                    alertDialogBuilder.setTitle("Your Title");

                    // set dialog message
                    alertDialogBuilder
                            .setMessage("Score is " + (int)((score/5)*100) + "%")
                            .setCancelable(false)
                            .setPositiveButton("Exit",new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    // if this button is clicked, close
                                    // current activity
                                    EconomicsActivity.this.finish();
                                }
                            })
                            .setNegativeButton("Try Again",new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    // if this button is clicked, just close
                                    // the dialog box and do nothing
                                    dialog.cancel();
                                    EconomicsActivity.this.recreate();

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