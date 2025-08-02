package com.oop.staticExample;

public class Main {
    public static void main(String[] args) {
        Human kartik = new Human(21, "Kartik", 10000, false);

        System.out.println(Human.population);  // 1
        System.out.println(kartik.name);
    }
}
