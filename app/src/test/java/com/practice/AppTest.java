/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.practice;


import org.junit.Test;
import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

public class AppTest {

    @Test public void testNotNullGreeting() {
        App classUnderTest = new App();
        assertThat(classUnderTest).isNotNull();
    }

    @Test public void testNullNameGreeting() {
        App classUnderTest = new App();
        assertThat(classUnderTest.getGreeting(null)).isEqualTo("null\tHello World!");
    }

    @Test public void testEmptyNameGreeting() {
        App classUnderTest = new App();
        assertThat(classUnderTest.getGreeting("")).isEqualTo("\tHello World!");
    }

    @Test public void testPassedInNameWithGreeting() {
        App classUnderTest = new App();
        assertThat(classUnderTest.getGreeting("Aadavan")).isEqualTo("Aadavan\tHello World!");
    }
}
