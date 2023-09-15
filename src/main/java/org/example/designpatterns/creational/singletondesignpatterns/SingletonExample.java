package org.example.designpatterns.creational.singletondesignpatterns;

public class SingletonExample {
    private static SingletonExample instance = null ;
    private SingletonExample(){}

    static SingletonExample getInstance(){
        if(instance == null){
            synchronized (SingletonExample.class){
                if(instance == null){
                    instance = new SingletonExample();
                }
            }
        }
        return instance;
    }

}
