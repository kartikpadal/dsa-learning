package com.oop.polymorphism;

public class Main {

    public static void main(String[] args) {
        // overloading
//        Overloading m = new Overloading();
//        m.hello();
//        m.hello(5);
//        System.out.println(m.sum(4,5));
//        System.out.println(m.sum(6.0,7));
//        System.out.println(m.sum(6.0,7.0));
//        System.out.println(m.sum("kp", 5));

        // overriding :
        // HOW java determines OVERRIDING? --> via " DYNAMIC DISPATCH METHOD "


        Shapes s = new Shapes();
        Shapes c = new Circle();   // can initialize subclass object using superclass reference
        Circle c2 = new Circle();   // can obviously initialize subclass obj using superclass reference
       // Circle c3 = new Shapes();    // can never access superclass object via subclass reference
        Shapes t = new Triangle();
        Shapes sq = new Square();

        s.area();   // obj is of Shapes(); So, overrides all methods and calls area() in Shapes
        c.area();   // obj is of Circle(); So, overrides all methods and calls area() in Circle
        c2.area();  // obj is of Circle(); So, overrides all methods and calls area() in Circle
        t.area();   // obj is of Triangle(); So, overrides all methods and calls area() in Triangle
        sq.area();  // obj is of Square(); So, overrides all methods and calls area() in Square
    }

}
