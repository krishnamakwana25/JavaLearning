package org.example.stringexample;

class Parent {
    Parent(){
        System.out.println("default");
    }
    Parent(int i){
        System.out.println("parent"+i);
    }
    public  void finalMethod() {
        System.out.println("This is a final method in the Parent class.");
    }
}

class Child extends Parent {
    public void check(){
        System.out.println("check");
    }
    Child(){}
    Child(int i){
        super(i);

        System.out.println(i);
    }
    // This will result in a compilation error
    public final void finalMethod() {

        System.out.println("This method cannot override the final method.");
        super.finalMethod();
        this.check();


    }
}

public class demo1 {
    public static void main(String[] args) {
        Parent p = new Child();
        Parent p1 = new Child(22);
        p.finalMethod();
    }
}
