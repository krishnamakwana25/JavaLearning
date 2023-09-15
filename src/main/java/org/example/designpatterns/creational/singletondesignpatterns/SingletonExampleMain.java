package org.example.designpatterns.creational.singletondesignpatterns;

public class SingletonExampleMain {
    public static void main(String[] args) {
        SingletonExample singletonExample = SingletonExample.getInstance();
        System.out.println(singletonExample);

        SingletonExample singletonExample1 = SingletonExample.getInstance();
        System.out.println( singletonExample1);

        System.out.println(singletonExample.hashCode());
        System.out.println(singletonExample1.hashCode());
    }
}
