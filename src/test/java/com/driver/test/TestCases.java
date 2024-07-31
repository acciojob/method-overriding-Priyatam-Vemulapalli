package com.driver.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCases {
    @Test
    public void testB() {
        com.driver.B b = new com.driver.B();
        Assertions.assertEquals("Method is overridden in Extended class B", b.meth());
    }
}
