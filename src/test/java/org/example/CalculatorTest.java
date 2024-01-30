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

    @Test
    void mul3And3Returns9() {
        assertEquals(9, Calculator.mul(3, 3));
    }

    @Test
    void subReturnsDiff() {
        assertEquals(1, Calculator.sub(2, 1));
    }

    @Test
    void divReturnsQuota() {
        assertEquals(2, Calculator.div(10,5));
    }
}
