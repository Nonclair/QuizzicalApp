package com.example.android.quizzicalapp;



public class GeographyQuestions {

    String[] mQuestions  = {
            "Which planet rotates on its axis from east to west?",
            "The minimun distance between the sun and the earth occurs on?",
            "On the day the sun is nearest to the earth, the earth is said to be in?",
            "The earth is at its maximum distance from the sun on?",
            "The rate of rotation of the earth on its axis is highest on?"


    };

    private String mChoices[][] = {
            {"Earth","Jupiter","Venus"},
            {"December 22","January 3","June 21"},
            {"Perihelion","Perigee","Aphelion"},
            {"January 30","July 4","December 22"},
            {"July 4","January 3","Never changes"}

    };

    private String mCorrectAnswers[] = {"Venus","January 3","Perihelion","July 4","Never changes"};


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
