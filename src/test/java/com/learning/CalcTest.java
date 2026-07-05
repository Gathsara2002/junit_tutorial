package com.learning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalcTest {

    @Test
    void add() {
        Calc calc = new Calc();
        assertEquals(30, calc.add(10, 20));
    }

    @Test
    void sub() {
        Calc calc = new Calc();
        assertEquals(5, calc.sub(10, 5));
    }

    @Test
    void mul() {
        Calc calc = new Calc();
        assertEquals(200, calc.mul(10, 20));
    }

    @Test
    void div() {
        Calc calc = new Calc();
        assertEquals(2, calc.div(10, 5));
    }
}