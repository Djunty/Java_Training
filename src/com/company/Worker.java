package com.company;

public class Worker {
    String name;
    String surname;
    double salary;

    public Worker() {

    }

    public Worker(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public void setPropeties(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }
}
