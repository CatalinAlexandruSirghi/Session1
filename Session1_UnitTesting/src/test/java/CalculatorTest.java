import org.example.Calculator;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(3, 4);

        assertEquals(7, result);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.substract(3, 4);

        assertEquals(-1, result);
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(3, 4);

        assertEquals(12, result);
    }

    @Test(expected = ArithmeticException.class) // we expect it to throw an exception and the test wont fail
    public void testDivide() {
        Calculator calculator = new Calculator();
//        int result = calculator.divide(8, 4);
//        assertEquals(2, result);

        int result = calculator.divide(8, 0);
        assertEquals(2, result);
    }


}
