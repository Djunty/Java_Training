package com.company;

import java.util.Arrays;
import java.util.Random;

public class CharMassive {
    public static void main (String []args){
        char letters[] = new char[100];
        char a = 'A';
        Random randomGenerator = new Random();
        for (int i = 0; i < letters.length; i++){
            int randomInt = randomGenerator.nextInt(26);
            letters[i] = (char) (a + randomInt);}
        System.out.println(Arrays.toString(letters));

        for (int i = 0; i < letters.length; i++){
            if (letters[i] == a) {
                int index = i;
                System.out.println(index);
            }
        }
    }
}
