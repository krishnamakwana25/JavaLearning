package org.example;

class ParentException{
    void msg()throws ArithmeticException {
        System.out.println("parent method");
    }
}

public class MethodOverridingWithException extends ParentException{
    void msg()throws ArithmeticException {
        System.out.println("child method");
    }

    public static void main(String args[]) {
        ParentException p = new ParentException();

        try {
            p.msg();
        }
        catch (Exception e){}

    }
}