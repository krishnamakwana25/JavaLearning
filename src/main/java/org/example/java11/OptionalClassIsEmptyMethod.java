package org.example.java11;

import java.util.Optional;

public class OptionalClassIsEmptyMethod {
    public static void main(String[] args) {

        String name = null;
        System.out.println(!Optional.ofNullable(name).isPresent());
        System.out.println(Optional.ofNullable(name).isEmpty());

        String name1= "Krishna";
        System.out.println(!Optional.ofNullable(name1).isPresent());
        System.out.println(Optional.ofNullable(name1).isEmpty());
    }
}
