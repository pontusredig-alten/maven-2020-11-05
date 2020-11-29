package se.iths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import se.iths.calculator.Calculator;

public class CalculatorTest {


    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    void testAdd2() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(3, 2));
    }

}

