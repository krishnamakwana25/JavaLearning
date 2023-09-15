package org.example.designpatterns.creational.abstractdesignpatterns;

public class Client {
    public static void main(String[] args) {
        Employee andriodEmployee = EmployeeFactory.getEmployee(new AndriodDevFactory());
        andriodEmployee.name();

        Employee webEmployee = EmployeeFactory.getEmployee(new WebDevFactory());
        webEmployee.name();

        Employee manager = EmployeeFactory.getEmployee(new ManagerFactory());
        manager.name();
    }
}
