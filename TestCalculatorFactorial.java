package Lesson_14_testng;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestCalculatorFactorial {
    @BeforeClass
    void setUp() {
        CalculatorFactorial factorial = new CalculatorFactorial();
    }

    @Test(description = "Вычисление факториала числа")
    void factorial() {
        Assert.assertEquals(CalculatorFactorial.factorial(5), 120);
    }
}
