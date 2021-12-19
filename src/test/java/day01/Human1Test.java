package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Human1Test {

    @Test
    void testNameAndAge() {
        Human1 human1 = new Human1("Peti bá", 1930);
        assertEquals(1930, human1.getYearOfBirth());
        assertEquals("Peti bá", human1.getName());
    }

    @Test
    void testThrow() {
        assertThrows(IllegalArgumentException.class, ()->new Human1("Petibá", 1940));
    }

    @Test
    void testThrow2() {
        assertThrows(IllegalArgumentException.class, ()->new Human1("Peti bá", 1900));
    }

    @Test
    void testThrow3() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, ()->new Human1("Petibá", 1940));
        assertEquals("Túl öreg vagy csak egy név" ,iae.getMessage());
    }

    @Test
    void testThrow4() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, ()->new Human1("Petibá", 1940));
        assertEquals(null ,iae.getCause());
    }
}