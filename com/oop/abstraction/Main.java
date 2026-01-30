package com.oop.abstraction;

public class Main {
    public static void main(String[] args){
        Son s = new Son(28);
        s.career();
        s.partner();
        s.bird();

        Daughter d = new Daughter(25);
        d.career();
        d.partner();
        d.bird();

        // You can't create objects of an abstract class.
        //Parent mon = new Parent(23);

        Parent mom = new Son(23);
        System.out.println(mom.age);

    }
}
