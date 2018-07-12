package com.ape.butter.testingmodule;

public class operators {
    public static void main(String[] args) {

        //Equal operator places everything to the right of it into the variable to the left
        //Plus operator adds the number to the right of it to the number on the left
        int result = 1 + 2;
        System.out.println(result);

        int previousResult = result;

        //Minus operator takes away the number that is on the right from the number on the left
        result = result - 1;
        System.out.println(result);

        //Times operator multiplies the numbers on either side of the operator by each other
        result = result * 10;
        System.out.println(result);

        //divide operator divides the number on the left by the number on the right
        result = result / 5;
        System.out.println(result);

        //Remainder operator gives the amount left over when you divide the number to the left of
        // the operator by the number on the right
        result = result % 3;
        System.out.println(result);

        //This is shorthand to adding one to a variable
        result++;
        System.out.println(result);

        //This is shorthand to taking away one from a variable
        result--;
        System.out.println(result);

        //This is short hand for keeping the previous value of the var and adding an amount to it
        result += 2;
        System.out.println(result);

        //This is the same but vice versa
        result -= 2;
        System.out.println(result);

        Boolean isCool = false;

        //Is whats on the left equal to whats on the right
        if (isCool == true)
            System.out.println("Its not cool");
        else
            System.out.println("its cool");

        int topScore = 100;

        //Is whats on the left not equal to whats on the right
        if (topScore != 100)
            System.out.println("Its not equal");

        //Is whats on the left greater than whats on the right
        if (topScore > 100)
            System.out.println("Its greater");

        //Is whats on the left greater than or equal whats on the right
        if (topScore >= 100)
            System.out.println("Its greater than or equal");

        //Is whats on the left less than whats on the right
        if (topScore < 100)
            System.out.println("Its less");

        //Is whats on the left less than or equal whats on the right
        if (topScore <= 100)
            System.out.println("Its less than or equal");

        int secondTopScore = 200;

        //the && lets you compare two things noth must be true for it to work
        if (topScore > secondTopScore && topScore < 100)
            System.out.println("greater than topscore and less than 100");




    }

}
