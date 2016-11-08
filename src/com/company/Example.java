package com.company;

import java.util.Arrays;

public class Example {



    public static void main (String [] args){
        int x = 10;
        int[] nubs = new int[x];



        // 0    2   0*2+2=0
        // 1    4   1*2=2
        // 2    6   i*2=4
        // 3    8   i*2=6
        //  0000 0001   1
        //  0000 0010   2
        //  0000 0011   3
        //  0000 0100   4
        //  0000 1000   8

        for (int i = 0; i < x; i++){
            //System.out.println(i * 2 + 2);
            nubs[i] = (i * 2) + 2;

        }


        for (int i = 0; i < x; i++) {
            System.out.print(nubs[i]);
            if (i != x - 1){
                System.out.print(", ");
            }
        }


        System.out.println();

        String s = ", ";
        for (int i = 0; i < x; i++) {
            if (i == x - 1){
                s = "";
            }
            System.out.print(nubs[i] + s);
        }
        System.out.println();
        System.out.println("========================");

        // for each
        for (int nub : nubs) {
            System.out.print(nub + " ");
        }
    }







}

class Nub {
    byte b = 127; // (-128 .. 127)
    short s = 32000;
    int age = 0;
    long l = 0L;
    float f = 0.0f;
    double weight = 0.0d;
    boolean marred = false;


    public Nub() {}

    public Nub(int age) {
        this.age = age;
        l = 100L;
    }
}
