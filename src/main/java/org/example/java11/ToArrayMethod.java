package org.example.java11;

import java.util.Arrays;
import java.util.List;

public class ToArrayMethod {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a1","a2","a3","a4","a5");

        String[] s1 = list.toArray(String[]::new);
        for (String s:s1) {
            System.out.println(s);
        }

        String []s2 = list.toArray(new String[list.size()]);

        for (String s:s1) {
            System.out.println(s);
        }
    }
}
