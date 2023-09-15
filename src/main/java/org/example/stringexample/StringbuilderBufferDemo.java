package org.example.stringexample;

public class StringbuilderBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Hello");
        StringBuffer sb2 = new StringBuffer("Hello");

        String str1 = sb1.toString();
        String str2 = sb2.toString();

        boolean isEqual = str1.equals(str2);
        System.out.println(isEqual);
    }
}
