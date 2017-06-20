package com.example.android.quizzicalapp;

/**
 * Created by Admin on 6/19/2017.
 */

public class EconomicsQuestions {

    String[] mQuestions  = {
            "Bank assurance is?",
            "Mutual funds are regulated by?",
            "TRAI regulates the functioning of which of the following?",
            "Micro credit or micro finance is a novel approach to bank with the poor. In this approach bank credit is extended to the poor through?",
            "The full form of PIN in ATM transaction is?"


    };

    private String mChoices[][] = {
            {"an insurance scheme exclusively for the employee of banks", "an insurance scheme to insure bank deposits", "a composite financial service offering both bank and insurance product"},
            {"Securities and Exchange Board of India (SEBI)", "Association of Mutual Funds of India (AMFI)", "IRDA"},
            {"Trade", "Telecom", "Transport"},
            {"Self Help Groups", "Co-operative Credit Societies", "RBI"},
            {"Professional Identification Number", "Personal Identification Number", "Personal Index Number"}
    };

    private String mCorrectAnswers[] = {"a composite financial service offering both bank and insurance product", "Securities and Exchange Board of India (SEBI)", "Telecom", "Self Help Groups", "Personal Identification Number"};


    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;

    }

    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;

    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;

    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getChoice4(int a) {
        String choice3= mChoices[a][3];
        return choice3;
    }


    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;



}
}

