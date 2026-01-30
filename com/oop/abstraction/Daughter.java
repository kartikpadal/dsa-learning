package com.oop.abstraction;

public class Daughter extends Parent{

    public Daughter(int age){
        super(age);
    }
    void career(){
        System.out.println("Doctor");
    }

    void partner(){
        System.out.println("XYZ");
    }

}
