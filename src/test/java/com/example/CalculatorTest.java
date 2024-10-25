package com.example;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Test primenumber")
    public void testIsPrime() {
        assertTrue(calculator.isPrime(7), "7 should be prime number");
        assertFalse(calculator.isPrime(4), "4 should not be a prime number");
    }

    @Test
    @DisplayName("Test counting primes within interval")
    public void testCountPrimesInInterval() {
        int count = calculator.countPrimesInInterval(0, 10);
        assertEquals(4, count, "There should be 4 primes beetween numbers 0 and 10");
    }

    @Test
    @DisplayName("Test sum of primes within interval")
    public void testSumPrimesInInterval() {
        int sum = calculator.sumPrimesInInterval(0, 10);
        assertEquals(17, sum, "The sum should be 17 between 0,10");
    }

    @Test
    @DisplayName("Test valid interval check")
    public void testIsValidInterval() {
        assertTrue(calculator.isValidInterval(0, 1000), "interval 0-1000 should be valid");
        assertFalse(calculator.isValidInterval(-1, 1000), "negative range should not be valid");
        assertFalse(calculator.isValidInterval(0, 1001), "interval above 1000 should not be valid");
    }


    @Test
    @DisplayName("User input is a string")
    public void testUserInputString() {
        String input = "hejsan";
        assertFalse(calculator.isInteger(input), "Input 'hejsan' should not be considered an integer");
    }

    @Test
    @DisplayName("User input is a valid integer")
    public void testUserInputValidInteger() {
        String input = "123";
        assertTrue(calculator.isInteger(input), "Input '123' should be considered a valid integer");
    }

    @Test
    @DisplayName("User input is an invalid number (decimal)")
    public void testUserInputDecimal() {
        String input = "12.34";
        assertFalse(calculator.isInteger(input), "Input '12.34' should not be considered a valid integer");
    }

    @Test
    @DisplayName("User input is a negative integer")
    public void testUserInputNegativeInteger() {
        String input = "-2222";
        assertTrue(calculator.isInteger(input), "Input '-2222' should be considered a valid integer");
    }

}
