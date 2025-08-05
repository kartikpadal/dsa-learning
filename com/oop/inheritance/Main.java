package com.oop.inheritance;

public class Main {
    public static void main(String[] args) {
        Box a = new Box(3,4,5);
        System.out.println(a.h);

        Box b = new BoxWeight(3,4,5,9); // This is upcasting: assigning a subclass object to a superclass reference
        System.out.println(b.h+", "+b.l+", "+b.w); // allowed
        // System.out.println(b.weight); ❌ error



    }
}
