package com.steadforce.main;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;



public class MainTest {

    private static Main m;

    @BeforeAll
    public static void setUp(){
        m = new Main();
    }


    @Test
    public void testMainDoSomeTrue() {
        assertTrue(m.doSome(true), "expected true");
    }


    @Test
    public void testMainDoSomeFalse() {
        assertFalse(m.doSome(false), "expected false");
    }


    @Test
    public void testMainDoSomeFalse_wrong() {
//        assertTrue(m.doSome(false), "expected false");
    }


    @Test
    public void testMainDoFail() {
//        m.doFail();
    }

    @Test
    public void testMainDoNOTFail() {

    }
}
