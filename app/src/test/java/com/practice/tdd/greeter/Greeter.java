package com.practice.tdd.greeter;

import java.util.Objects;

public class Greeter {

    public String greet(String name) {
        return (Objects.isNull(name) || name.isBlank() || name.isEmpty()) ? "" : "Welcome " + name;
    }
}
