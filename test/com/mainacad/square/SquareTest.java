package com.mainacad.square;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void testGetArea() {
        Square square = new Square(10);
        assertEquals(100, square.getArea());
    }
}