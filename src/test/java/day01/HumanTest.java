package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    @Test
    void testGetNameAndDateOfBirth() {
        Human human1 = new Human("Nagy Piroska", 1900);
        assertEquals("Nagy Piroska", human1.getName());
        assertEquals(1900, human1.getDateOfBirth());
    }

    @Test
    void testThrow() {
        //Human human2 = new Human("NagyPiroska", 1900);
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, ()->new Human("NagyPiroska", 1900));
        assertEquals("A megadott adatok nem megfelelőek!", iae.getMessage());
    }

}