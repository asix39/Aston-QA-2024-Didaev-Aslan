package Lesson_14_junit_5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

public class TestCalculatorFactorial {

    private CalculatorFactorial factorial;

    @BeforeEach
    void setUp() {
        CalculatorFactorial factorial = new CalculatorFactorial();
    }

    @Test
    @DisplayName("Cравнение одинаковых значений")
     void factorial1() {
        int result = CalculatorFactorial.factorial(5);
        Assertions.assertEquals(120, result);
    }

    @Test
    @DisplayName("Cравнение неравных значений")
     void factorial2() {
        int result = CalculatorFactorial.factorial(5);
        Assertions.assertNotEquals(125, result);
    }

    @Test
    @DisplayName("Cравнение c нулём")
     void factorial3() {
        int result = CalculatorFactorial.factorial(5);
        Assertions.assertNotEquals(0, result);
    }
}
