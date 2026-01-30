package com.oop.Interfaces;

public class Main {
    public static void main(String[] args) {
//        Car c = new Car();
//        c.start();
//        c.acc();
//        c.stop();

 //       Media c2 = new Car();   // this just prints the start() of engine
       // c2.start();


        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();
    }
}
