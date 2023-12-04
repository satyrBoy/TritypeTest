package com.example.myapplication;

import junit.framework.TestCase;

public class TritypeDecisionTest extends TestCase {
// if (Side1+Side2 <= Side3 || Side2+Side3 <= Side1 || Side1+Side3 <= Side2)

    //decision in the main method
    public void testTriang() {
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(1, 2, 6));
        assertEquals(1, tri.Triang(3, 5, 6));
    }
}