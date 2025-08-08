package com.oop.polymorphism;

public class Main {

    public static void main(String[] args) {
        Overloading m = new Overloading();
        m.hello();
        m.hello(5);
        System.out.println(m.sum(4,5));
        System.out.println(m.sum(6.0,7));
        System.out.println(m.sum(6.0,7.0));
        System.out.println(m.sum("kp", 5));
    }

}
