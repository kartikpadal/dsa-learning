package com.oop.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population; // this variable is not dependent on any object



    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;  // whenever an object of Human gets created i.e. a Human borns,
                                // the population goes up by 1
    }
}
