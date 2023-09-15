package org.example.stringexample;

public class StringConcatDemo {
    public static void main(String[] args) {
        String s1 = "Krishna";
        String s2 = "Makwana";
        String s3 = s1.concat(s2);
        String s4 = s1+s2;
        System.out.println("s1 :- "+s1);
        System.out.println("s2 :- "+s2);
        System.out.println("s3 :- "+s3);

        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));

        String s ="";
        System.out.println(s.isBlank());
        System.out.println(s.isEmpty());
    }
}
