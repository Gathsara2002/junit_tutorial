package com.learning.test_driven_architecture;

import com.learning.extension.LoggingExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(LoggingExtension.class)
class ShapeTest {

    Shape shape = new Shape();

    @Test
    void areaOfSquare() {
        assertEquals(100, shape.areaOfSquare(10));
    }

    @Test
    void areaOfCircle() {
        assertEquals(154, shape.areaOfCircle(7), "Test failed");
    }
}