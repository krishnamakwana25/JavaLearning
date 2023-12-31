package org.example.java11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateNotMethod {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Krishna", " ","Akshit", "Heena","Bhumi   ");
        List<String> collect = list.stream()
                .filter(Predicate.not(String::isBlank))
                .collect(Collectors.toList());

        collect.forEach(System.out::println);
    }
}
