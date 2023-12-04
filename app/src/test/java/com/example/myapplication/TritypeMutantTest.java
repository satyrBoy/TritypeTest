package com.example.myapplication;

import static org.junit.Assert.assertEquals;

import junit.framework.TestCase;

import org.junit.Test;

public class TritypeMutantTest extends TestCase {
    @Test
    public void testMutantInTriang1() {
        assertEquals(2, new TritypeMutantOne().Triang(3, 3, 7));
    }
    @Test
    public void testMutantInTriang2() {
        assertEquals(2, new TritypeMutantOne().Triang(3, 3, 6));
    }

}