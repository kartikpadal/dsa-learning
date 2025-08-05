package com.oop.inheritance;

public class BoxWeight extends Box{

        double weight;

    BoxWeight(double h, double l , double w, double weight) {
        super(h, l, w);
        this.weight = weight;
    }
}
