package com.oop.polymorphism;

public class Square extends Shapes {
    void area(){
        System.out.println("side * side");
    }

//    void hello(){                                 // error : coz superclass has hello() as a static method
//        System.out.println("hello from square");   // & static methods cant be overridden bcoz they dont depend on objects
//    }
}
