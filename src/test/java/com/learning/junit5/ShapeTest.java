package com.learning.junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    Shape shape = new Shape();

    @Test
    void areaOfSquare() {
        assertEquals(4, shape.areaOfSquare(2), "Error at calculating area of a square");
    }

    //use supplier interface for give error message if test fail. this is the efficient way because supplier interface
    //evaluate only if test fail
    @Test
    void areaOfCircle() {
        assertEquals(154, shape.areaOfCircle(7), () -> "Error at calculating area of circle");
    }

    @Test
    void areaOfSquareTest() {
        assertNotEquals(9, shape.areaOfSquare(5), () -> "Error at calculating area of a square");
    }

    //pass if condition true
    @Test
    void testAsserTrue() {
        assertTrue(true);
    }

    //pass if condition false
    @Test
    void testAsserFalse() {
        assertFalse(false);
    }
}