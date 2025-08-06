package com.oop.inheritance;

public class BoxWeight extends Box{

    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    BoxWeight(BoxWeight other){
        super(other);
        this.weight = other.weight;
    }

    BoxWeight(double h, double l , double w, double weight) {
        super(h, l, w);
        super.weight = weight;  // use super if superclass also has weight variable &
                                // you want to use weight from superclass

        this.weight = weight;  // use 'this' if want to access weight from subclass
    }

}
