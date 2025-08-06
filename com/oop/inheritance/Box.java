package com.oop.inheritance;

public class Box {
    double h,l,w,weight;


    Box(){
        super(); // this calls the object class "the baap of all classes";
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }
    Box(double h, double l, double w){
        this.h = h;
        this.l = l;
        this.w = w;
    }
}
