package com.oop.inheritance;

public class Main {
    public static void main(String[] args) {
        Box a = new Box(3,4,5);
        System.out.println(a.h);

        BoxWeight b2 = new BoxWeight(1,2,3,4);        //Full access to all members, including
        System.out.println(b2.h+", "+b2.l+", "+b2.w+", "+b2.weight);   //inherited ones and those declared in BoxWeight

        Box b = new BoxWeight(3,4,5,9); // This is upcasting: assigning a subclass object to a superclass reference
        System.out.println(b.h+", "+b.l+", "+b.w); // allowed
        // System.out.println(b.weight);  error: can only access Box members




    }
}
