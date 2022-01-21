package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void addReturnsSum() {
        assertEquals(3, Calculator.add(1, 2));
    }

    @Test
    void mulReturnsProduct() {
        assertEquals(4, Calculator.mul(2, 2));
    }

}
