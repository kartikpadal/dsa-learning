package com.oop.staticExample;

public class InnerClasses {

    static class Test{
        String name;
        public Test(String name){
            this.name = name;
        }

    }

    public static void main(String[] args) {
        Test a = new Test("kartik");
        Test b = new Test("padal");
//        System.out.println(Test.name);   // padal  --
//        System.out.println(Test.name);   // padal  --  if name is declared a static

        System.out.println(a.name);  //kartik
        System.out.println(b.name);  // padal
    }
}
