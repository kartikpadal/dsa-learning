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

        // what if: box & boxWeight both have weight variable ?
        // then:-  use 'super.weight = weight;' inside boxWeight() constructor
        BoxWeight b3 = new BoxWeight(15,14,15,19);
        System.out.println(b3.h+", "+b3.l+", "+b3.w+", "+b3.weight);   // here weight=19 for subclass

        // for Box class
        Box b4 = new BoxWeight(15,14,15,20);
        System.out.println(b4.h+", "+b4.l+", "+b4.w+", "+b4.weight);   // here weight=20 for superclass

        // multilevel inheritance
        BoxPrice b5 = new BoxPrice(5,50,100);
        System.out.println(b5.l+", "+b5.weight+", "+b5.cost);
    }
}
