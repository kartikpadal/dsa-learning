package com.oop.abstraction;

// even if you have one abstract method, then the class also has to be declared as abstract
public abstract class Parent {

    int age;

    public Parent(int age){
        this.age = age;
    }

    abstract void career();

    abstract void partner();

    // can have normal methods as well as abstract ones
    void bird(){
        System.out.println("*Chirps*");
    }

    // cant create abstract static methods in an abstract class since abstract methods need to get overridden
    // and static methods cant get overridden but u can create normal static methods tho:
    static void hello(){
        System.out.println("hi");
    }

    // can also have normal methods:
    void normal(){
        System.out.println("a normal method");
    }



}
