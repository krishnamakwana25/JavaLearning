package org.example.innerclassesdemo;
abstract class AnonymousDemo{
    abstract void print();
}
public class AnonymousInnerClassDemo {
    public static void main(String[] args) {
        AnonymousDemo a = new AnonymousDemo() {
            @Override
                void print() {
                System.out.println("example of anonymous inner class");
            }
        };
    }
}
