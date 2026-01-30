package com.oop.Interfaces;

// since Engine and Media both have same named methods and the Engine methods are already used in Car,
// for us to use the Media methods( start() and stop() ) we have to create separate class for them

public class CDPlayer implements Media{

    public void start(){
        System.out.println("Music ON");
    }

    public void stop(){
        System.out.println("Music OFF");
    }
}
