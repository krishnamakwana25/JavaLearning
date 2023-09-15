package org.example.designpatterns.creational.factorydesignpatterns;

public class Client {
    public static void main(String[] args) {
        Employee androidDeveloper = EmployeeFactory.getEmployee("android");
        androidDeveloper.salary();

        Employee webDeveloper = EmployeeFactory.getEmployee("web");
        webDeveloper.salary();
    }
}
