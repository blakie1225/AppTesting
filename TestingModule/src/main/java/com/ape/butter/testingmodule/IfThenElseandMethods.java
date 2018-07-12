package com.ape.butter.testingmodule;

public class IfThenElseandMethods {

    public static void main(String[] args) {


        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(true, 800, levelCompleted, bonus);
        calculateScore(true, 10000, 8, 200);



    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Final score: " + finalScore);
            return finalScore;
        }

        return -1;
    }
}
