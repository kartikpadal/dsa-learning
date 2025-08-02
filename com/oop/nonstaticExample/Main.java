package com.oop.nonstaticExample;

public class Main {
    public static void main(String[] args){
//      greet();    // gives error: non-static stuff not accessible from static stuff
        Main a = new Main();
        a.greet();      // works bcoz, we're creating an object of the static class
                         // and then accessing greet();
    }


    void greet(){
        System.out.println("hello");
    }
}
