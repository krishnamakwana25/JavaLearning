package org.example.designpatterns.creational.abstractdesignpatterns;

public class WebDeveloper implements Employee{

    @Override
    public int salary() {
        return 4000;
    }

    @Override
    public String name() {
        System.out.println("I am web developer");
        return "I am web developer";
    }
}
