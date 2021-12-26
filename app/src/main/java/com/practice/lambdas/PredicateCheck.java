package com.practice.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateCheck {

    public static void main(String[] args) {
        Predicate<String> name = Objects::nonNull;
        name = name.or(s -> s.startsWith("A"));
        name = name.and(s -> s.length() > 6);

        List<String> names = Arrays.asList("Aadavan", "Mahesh");
        List<String> collect = names.stream().filter(name).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
