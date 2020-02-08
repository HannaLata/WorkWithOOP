package com.mainacad.triangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void testGetArea() {
        Triangle triangle = new Triangle(10, 11);
        assertEquals(55, triangle.getArea());
    }
}