package com.company;

public class SecondClass {

    public static void main (String[] args) {

        monthDays("Feb");
    }

    public static void monthDays (String a){
        int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String month[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Now", "Dec"};

        for (int i = 0; i < 12; i++){
                if (month[i].equals(a)) {
                    System.out.println(a + " has a " + days[i] + " days!");
                    break;
                }


        }


    }

    
}
