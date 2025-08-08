package com.oop.polymorphism;


public class Overloading {
    void hello(){
        System.out.println("hello");
    }

//    int hello(){       // although return type is diff but parameter no. is same (0) --> error
//         return 1;
//    }

    void hello(int a){
        hello();
        System.out.println(a);
    }

    int sum(int a , int b){
        return a+b;
    }

//    double sum(int a, int b){    // here, although return type is different but the parameters are
//         return a+b;             //  of same type & same no. --> error
//    }

    double sum(double a, int b){   // same no. of parameters but type is different
        return a+b;                // --> correct
    }


    double sum(double a, double b){    // same no. of parameters , same return type
        return a+b;                   //  but diff type of parameters
    }

    String sum(String s, int a){
        return s+a;
    }
}
