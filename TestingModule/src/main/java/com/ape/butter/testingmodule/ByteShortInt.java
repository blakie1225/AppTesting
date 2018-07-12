package com.ape.butter.testingmodule;

public class ByteShortInt {

   public static void main(String[] args) {

        //Min and max values that int can hold
        //The underscores let you read the number more easily
        //It has a width of 32
        int minIntValue = -2_147_483_648;
        int maxIntValue = 2_147_483_647;

        //Min and max values that byte can hold
        //It has a width of 6
        byte minByteValue = -128;
        byte maxByteValue = 127;

        //Java automatically changes the number your assigning to a value to an int
        //You need to specify that your assigning the number a byte value by casting a byte in front
        byte newByteValue = (byte) (minByteValue / 2);

        //Min and max values that short can hold
        //It has a width of 16
        short minShortValue = -32_768;
        short maxShortValue = 32_767;

        short newShortValue = (short) (minShortValue / 2);

        //Min and max values that long can hold
        //long variables require the letter L at the end of the number
        //It can be capital or lower case
        //Has a width of 64
        long minLongValue = -9_223_372_036_854_775_808L;
        long maxLongValue = 9_223_372_036_854_775_807L;


        //challenge

        byte myByte = 10;
        short myShort = 20;
        int myInt = 50;

        long longTotal = 50000L + 10L * (myByte + myShort + myInt);
        System.out.println("My long : " + longTotal);

        short shortTotal = (short) (1000 + 10 * (myByte + myShort + myInt));
        System.out.println("My short : " + shortTotal);


        
    }
}
