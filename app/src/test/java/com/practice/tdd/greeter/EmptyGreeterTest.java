package com.practice.tdd.greeter;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class EmptyGreeterTest {

    @Test
    public void testNotNull() {
        Greeter greeter = new Greeter();
        Assertions.assertThat(greeter).isNotNull();
    }

    @Test
    public void testEmptyMessage() {
        Greeter greeter = new Greeter();
        Assertions.assertThat(greeter.greet(null)).isEqualTo("");
    }

    @Test
    public void testNoneMessage() {
        Greeter greeter = new Greeter();
        Assertions.assertThat(greeter.greet("")).isEqualTo("");
    }
}
