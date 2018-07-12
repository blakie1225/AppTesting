package com.ape.butter.testingmodule;

public class FloatandDouble {

    public static void main(String[] args) {

        //int values only handle whole numbers so this will not give you the remainder
        //Has a width of 32
        int intVal = 5 / 3;

        //Java automatically assumes values with a point are doubles so you need
        // to cast the number your assigning to a float as a float value or by adding an f at the end
        //Has a width of 32
        float floatVal1 = (float) 5.4;

        //floats has 7 decimal digit places
        //Has a width of 32
        float floatVal = 5f / 3f;

        //double has 16 decimal digit places
        //width of a double is 64
        //double is actually more efficient than float and used in java functions by default
        double doubleVal = 5d / 3d;

        System.out.println("intVal = " + intVal);
        System.out.println("floatVal = " + floatVal);
        System.out.println("doubleVal = " + doubleVal);

        //Challenge

        double pounds = 200;
        double poundsInKilograms = pounds * 0.45359237;
        System.out.println("The weight of pounds in Kg is : " + poundsInKilograms);

    }

    }
