package com.oop.inheritance;

public class Main {
    public static void main(String[] args) {
        Box a = new Box();
        BoxWeight b = new BoxWeight(3,4,5,10);
        System.out.println(a.h);
        System.out.println(b.h+", "+b.l+", "+b.w+", "+b.weight);
    }
}
