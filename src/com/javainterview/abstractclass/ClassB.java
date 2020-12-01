package com.javainterview.abstractclass;

public class ClassB extends ClassA {

    int i = 20;

    public  ClassB(){
       // super();
        System.out.println("I am in ClassB " + i);
    }

    public void two(){

        System.out.println("I am in class B");

    }



    public void one(){
        super.one();
        System.out.println("method one in class B");

    }
}
