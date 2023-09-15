package org.example.designpatterns.creational.singletondesignpatterns;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class WaysToBreakSingletonDesignPattern {


    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, FileNotFoundException, IOException, CloneNotSupportedException {
        Singleton originalSingletonInstance=Singleton.getInstance();
        Singleton duplicateSingletonInstance=Singleton.getInstance();

        System.out.println("Hash Code for Original Singleton ::"+originalSingletonInstance.hashCode());

        System.out.println("Hash Code for Duplicate  Singleton ::"+duplicateSingletonInstance.hashCode());

        System.out.println("-------------------------------------------------------------------------------");
        //Reflection
        Class<?> singletonClass=Class.forName("Singleton");
        Constructor<Singleton> constructor=(Constructor<Singleton>) singletonClass.getDeclaredConstructor();
        constructor.setAccessible(true);

        Singleton brokenSingletonUsingReflection=constructor.newInstance();
        System.out.println("Hash Code for Original Singleton ::"+originalSingletonInstance.hashCode());
        System.err.println("Hash Code for Broken Singleton Instances ::"+brokenSingletonUsingReflection.hashCode());

        //serailization

        System.out.println("--------------------------------------------------------");
        System.out.println("Breakin Singleton using Serialization");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("D:\\Serilization.ser"));
        objectOutputStream.writeObject(originalSingletonInstance);
        objectOutputStream.close();


        //deserialization

        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("D:\\\\Serilization.ser"));
        Singleton brokenSingletonUsingSerialization=(Singleton) objectInputStream.readObject();

        System.out.println("Hash Code for Original Singleton ::"+originalSingletonInstance.hashCode());
        System.err.println("Hash Code for Broken using Serialization ::"+brokenSingletonUsingSerialization.hashCode());

        System.out.println("--------------------------------------------------------");
        System.out.println("Breakin Singleton using Clonable");

        Singleton brokenSingletonUsingCloning=(Singleton) originalSingletonInstance.clone();
        System.out.println("Hash Code for Original Singleton ::"+originalSingletonInstance.hashCode());
        System.err.println("Hash Code for Broken using Cloneable ::"+brokenSingletonUsingCloning.hashCode());




    }
}