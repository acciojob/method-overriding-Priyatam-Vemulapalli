package com.driver.test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public class TestCases {
    @Test
    public void testB() {
        com.driver.B b = new com.driver.B();
        assertEquals("Method is overridden in Extended class B", b.meth());
    }
}
