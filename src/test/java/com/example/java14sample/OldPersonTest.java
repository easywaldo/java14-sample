package com.example.java14sample;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OldPersonTest {
    public record Person (String name, String address) {}

    @Test
    public void givenValidNameAndAddress_whenGetNameAndAddress_thenExpectedValuesReturned() {
        String name = "John Doe";
        String address = "100 Linda Ln.";

        Person person = new Person(name, address);

        assertEquals(name, person.name());
        assertEquals(address, person.address());
    }

    @Test
    public void givenSameNameAndAddress_whenEquals_thenPersonsEqual() {
        String name = "John Doe";
        String address = "100 Linda Ln.";

        Person person1 = new Person(name, address);
        Person person2 = new Person(name, address);

        assertTrue(person1.equals(person2));
    }

    @Test
    public void givenSameNameAndAddress_whenHashCode_thenPersonsEqual() {
        String name = "John Doe";
        String address = "100 Linda Ln.";

        Person person1 = new Person(name, address);
        Person person2 = new Person(name, address);

        assertEquals(person1.hashCode(), person2.hashCode());
    }
}