package com.company;

import java.util.Arrays;

public class FirstClass {

    public static void main(String args[]) {

        daysCountInMonth("Feb");
    }

    public static void daysCountInMonth (String a){
        int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Now", "Dec"};





        boolean check = false;
        for(int i = 0; i < 12; i++){
            check = months[i].equals(a);
            if (check){
                System.out.println(months[i] + " has - " + days[i] + " days");
                break;
            }
        }
        check = false;
        if (!check) {
            System.out.println(a + " is unknown month name");

        }

    }

}





















   /* public static void main(String[] args) {
        Worker worker1 = new Worker();
        worker1.setPropeties("Taras", "", 2000.01);


        Worker worker2 = new Worker("Nazar", "", 2000.03);

        Reviewer.review(worker1);
        Reviewer.review(worker2);
        System.out.println(worker1.salary + "====" + worker2.salary);
    }*/

