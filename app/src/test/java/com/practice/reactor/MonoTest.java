package com.practice.reactor;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import reactor.core.publisher.Mono;

public class MonoTest {

    @Test
    public void firstMono() {
        Mono.just("A").subscribe(System.out::println);
    }

    @Test
    public void monoWithConsumer() {
        Mono.just("A").log().subscribe(System.out::println);
        //Assertions.assertThat("Hello").isNotEmpty();
    }
}
