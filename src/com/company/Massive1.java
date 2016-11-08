package com.company;

import java.util.Arrays;

public class Massive1 {
   public static void main (String[]args){

       int [] numbers = new int[99];
       // 0 - 0 - 1
       // 1 - 1 - 2
       // 2 - 2 - 3
       for (int i = 0; i < numbers.length; i++) {
           //i = i + 1;
           numbers[i] = i + 1;
       }
       
       System.out.println(Arrays.toString(numbers));

       String s = ", ";
       for (int i = 98; i >= 0; i--) {
           if (i == 0){
               s = "";
           }
           System.out.print(numbers[i] + s);
       }

   }
}
