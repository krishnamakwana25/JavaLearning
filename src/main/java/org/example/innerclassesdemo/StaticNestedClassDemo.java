package org.example.innerclassesdemo;
class OuterClassDemo{
    static class StaticInnerClass{
        void print(){
            System.out.println("StaticInnerClass Demo");
        }
    }
}
public class StaticNestedClassDemo {
    public static void main(String[] args) {
        OuterClassDemo.StaticInnerClass outerClassDemo = new OuterClassDemo.StaticInnerClass();
        outerClassDemo.print();

    }
}
