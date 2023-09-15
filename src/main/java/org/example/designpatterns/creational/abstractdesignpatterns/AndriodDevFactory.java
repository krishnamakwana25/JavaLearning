package org.example.designpatterns.creational.abstractdesignpatterns;

public class AndriodDevFactory extends EmployeeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return new AndriodDeveloper();
    }
}
