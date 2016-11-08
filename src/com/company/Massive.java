package com.company;

import java.util.Arrays;
import java.util.Random;

public class Massive {
    public static void main (String[]args){

        int nubs [] = {0, -5, -45, -157, -5, -45, -157};
        Arrays.sort(nubs);
        int max = nubs[0];
        int min = nubs[0];
        int imax = 0;
        int imin = 0;

        for (int i = 1; i < nubs.length; i++){
            if (nubs[i] > max){
                max = nubs[i];
                imax = i;
            }
            if (nubs[i] < min){
                min = nubs[i];
                imin = i;
            }
        }
       // Nubs[imax] = imin;
       // Nubs[imin] = imax;


        System.out.println(Arrays.toString(nubs));

        System.out.println("Max namber - (" + nubs[imax] + ")");
        System.out.println("Min namber - (" + nubs[imin] + ")");


    }
}
