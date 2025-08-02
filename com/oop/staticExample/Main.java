package com.oop.staticExample;

public class Main {
    public static void main(String[] args) {
        Human kunal = new Human(22, "Kunal", 10000, false);
        Human rahul = new Human(34, "Rahul", 15000, true);
        Human arpit = new Human(34, "arpit", 15000, true);

        System.out.println(Human.population);

    }
}
