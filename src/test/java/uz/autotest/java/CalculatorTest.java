package uz.autotest.java;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @ParameterizedTest(name = "add({0}, {1}) = {2}")
    @CsvSource({
            "1, 1, 2",
            "2, 2, 4",
            "-1, -1, -2",
            "0, 0, 0"
    })
    void testAdd(int x, int y, int expected) {
        assertEquals(expected, calculator.add(x, y));
    }

    @ParameterizedTest(name = "subtract({0}, {1}) = {2}")
    @CsvSource({
            "1, 1, 0",
            "5, 3, 2",
            "-1, -1, 0",
            "0, 0, 0"
    })
    void testSubtract(int x, int y, int expected) {
        assertEquals(expected, calculator.subtract(x, y));

    }
}
