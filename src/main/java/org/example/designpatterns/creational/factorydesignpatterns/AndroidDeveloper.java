package org.example.designpatterns.creational.factorydesignpatterns;

public class AndroidDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("Android Developer salary");
        return 50000;
    }
}
