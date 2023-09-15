package org.example.designpatterns.creational.abstractdesignpatterns;

public class ManagerFactory  extends EmployeeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return  new Manager();
    }
}
