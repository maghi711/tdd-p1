package com.practice.tdd.greeter;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NameGreeterTest {
    Greeter greeter;

    @Before
    public void beforeEachTest() {
        greeter = new Greeter();
    }

    @Test
    public void testName() {
        String result = greeter.greet("Aadavan");
        assertThat(result).isNotNull();
        assertThat(result).isNotEmpty();
    }
}
