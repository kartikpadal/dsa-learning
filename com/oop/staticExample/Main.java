package com.oop.staticExample;

public class Main {
    public static void main(String[] args) {
        Human kartik = new Human(21, "Kartik", 10000, false);
        Human kp = new Human(1,"f",45,true);
        System.out.println(Human.population);  // 2
        System.out.println(kartik.name);

    }
}

