package com.techacademy.math;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

    @Test
    public void testGetNumber01() throws Exception {
        Fibonacci sut = new Fibonacci();
        Integer expected = 1;
        
        Integer actual = sut.getNumber(1);
        
        assertEquals(expected, actual);
    }

    @Test
    public void testGetNumber02() throws Exception {
        Fibonacci sut = new Fibonacci();
        Integer expected = 1;
        
        Integer actual = sut.getNumber(2);
        
        assertEquals(expected, actual);
    }

    @Test
    public void testGetNumber03() throws Exception {
        Fibonacci sut = new Fibonacci();
        Integer expected = 2;
        
        Integer actual = sut.getNumber(3);
        
        assertEquals(expected, actual);
    }

}