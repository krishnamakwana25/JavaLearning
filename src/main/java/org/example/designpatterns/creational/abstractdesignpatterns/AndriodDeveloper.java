package org.example.designpatterns.creational.abstractdesignpatterns;

public class AndriodDeveloper implements Employee{

    public int salary(){
        return 5000;
    }
    public String name(){
        System.out.println("I am Android developer");
        return "I am Android developer";
    }
}
