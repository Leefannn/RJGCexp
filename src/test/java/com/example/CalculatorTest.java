// src/test/java/com/example/CalculatorTest.java
package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    // 在每个测试方法之前执行
    @BeforeEach
    void setUp() {
        calculator = new Calculator(); // 初始化 Calculator 对象
    }

    // 测试加法方法
    @Test
    void testAdd() {
        assertEquals(5, calculator.add(2, 3));   // 2 + 3 = 5
        assertEquals(-1, calculator.add(-2, 1)); // -2 + 1 = -1
        assertEquals(0, calculator.add(0, 0));   // 0 + 0 = 0
    }

    // 测试减法方法
    @Test
    void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2));  // 3 - 2 = 1
        assertEquals(0, calculator.subtract(1, 1));  // 1 - 1 = 0
        assertEquals(-3, calculator.subtract(-1, 2)); // -1 - 2 = -3
    }

    // 测试乘法方法
    @Test
    void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));  // 2 * 3 = 6
        assertEquals(0, calculator.multiply(0, 5));  // 0 * 5 = 0
        assertEquals(12, calculator.multiply(-3, -4)); // -3 * -4 = 12
    }

    // 测试除法方法
    @Test
    void testDivide() {
        assertEquals(2.0, calculator.divide(6, 3)); // 6 / 3 = 2.0
        assertEquals(2.5, calculator.divide(5, 2)); // 5 / 2 = 2.5
    }

    // 测试除数为 0 的情况，应该抛出异常
    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(1, 0));
    }
}

