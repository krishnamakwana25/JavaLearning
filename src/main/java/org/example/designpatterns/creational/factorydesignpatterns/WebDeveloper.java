package org.example.designpatterns.creational.factorydesignpatterns;

public class WebDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("Web Developer salary");
        return 40000;
    }
}
