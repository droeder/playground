package com.steadforce.other;

import com.steadforce.other.Other;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OtherTest {

    @Test
    public void testOtherSomeTrue(){
        assertTrue(new Other().doSome(true));
    }


    @Test
    public void testOtherSomeFalse(){
        assertFalse(new Other().doSome(false));
    }


    @Test
    public void testOtherOther(){
        assertFalse(true);
    }

}
