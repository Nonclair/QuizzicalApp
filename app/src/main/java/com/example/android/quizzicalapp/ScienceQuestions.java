package com.example.android.quizzicalapp;



public class ScienceQuestions {

    String[] mQuestions  = {
            "The universal law of gravitation was propounded by____",
            "The gravitational force with which the sun attracts the earth?",
            "If the distance between the earth and the sun were twice what it is now, the gravitational force exerted on the earth by the sun would be?",
            "The weight of a body is_____",
            "A person weighs more in a lift, which is?"



    };

    private String mChoices[][] = {
            {"Kepler","Galileo","Newton"},
            {"is same as the force with which the earth attracts the sun.","is less than the force with which the earth attracts the sun.","is more than the force with which the earth attracts the sun."},
            {"twice as large as now","four times as large as it is now","one-fourth of what it is now"},
            {"the same everywhere on the surface of the earth.","maximum at the pole.","more on the hills than in the plains."},
            {"moving up with constant velocity","accelerating upward","moving down with constant velocity"}

    };

    private String mCorrectAnswers[] = {"Newton","is same as the force with which the earth attracts the sun.","one-fourth of what it is now","maximum at the pole.","accelerating upward"};


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
