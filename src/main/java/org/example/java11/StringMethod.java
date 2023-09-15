package org.example.java11;

public class StringMethod {
    public static void main(String[] args) {
        String name="Krihna makwana";
        String whiteSpace = " ";
        String list= "These Java 11 interview questions cover some of the new features and changes introduced in Java 11, \nsuch as the var keyword, String methods, stream enhancements, and the new HttpClient. \nDepending on your interview, \nyou may encounter more specific questions related to Java 11 features and their usage.";
        String prefix= "            krishna";
        String suffix= "krishna!      ";

        System.out.println("Before:- "+name);
        System.out.println("Before:- "+whiteSpace.isBlank());
        System.out.println("Before:- "+list);
        System.out.println("Before:- "+prefix);
        System.out.println("Before:- "+suffix);

        System.out.println("After:- "+name.repeat(5));
        System.out.println("After:- "+whiteSpace.isEmpty());
        System.out.println("After:- "+list.lines());
        System.out.println("After:- "+prefix.stripLeading());
        System.out.println("After:- "+suffix.stripTrailing());

    }
}
