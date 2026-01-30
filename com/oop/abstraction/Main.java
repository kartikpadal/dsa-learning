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
    }
}
