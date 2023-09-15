package org.example.designpatterns.creational.singletondesignpatterns;
import java.io.Serializable;

public class Singleton implements Serializable,Cloneable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private static Singleton instance;

    // Private constructor to prevent direct instantiation
    private Singleton() {
    }

    // Public method to access the singleton instance
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }
}