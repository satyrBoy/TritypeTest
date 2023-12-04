package com.example.myapplication;

import junit.framework.TestCase;

public class TritypeConditionTest extends TestCase {
//if (Side1 <= 0 || Side2 <= 0 || Side3 <= 0)

    //condition in training method
public void testTriang() {
    Tritype tri = new Tritype();
    assertEquals(4, tri.Triang(-1, 3, 1));
    assertEquals(2, tri.Triang(3, 3, 2));
    assertEquals(4, tri.Triang(3, -1, 1));
    assertEquals(2, tri.Triang(3, 3, 2));
    assertEquals(4, tri.Triang(3, 3, -1));
    assertEquals(2, tri.Triang(2, 3, 2));
}
}