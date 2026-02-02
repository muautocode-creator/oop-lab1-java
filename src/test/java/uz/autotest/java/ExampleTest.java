package uz.autotest.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleTest {

    @Test
    void testMultiply() {
        Example example = new Example();
        int result = example.multiply(2, 3);
        Assertions.assertEquals(6, result);
    }
}
