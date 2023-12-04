package com.example.myapplication;

import junit.framework.TestCase;

public class TritypeTest extends TestCase {

    public void testTriang() {
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(1, 2, 7));
    }
}