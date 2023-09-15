package org.example.designpatterns.creational.factorydesignpatterns;

public class EmployeeFactory {
    public static Employee getEmployee(String type){
        if(type.equals("android")){
            return new AndroidDeveloper();
        } else if (type.equals("web")) {
            return new WebDeveloper();
        }
        else {
            return null;
        }
    }
}