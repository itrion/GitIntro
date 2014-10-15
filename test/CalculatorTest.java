import gitinit.Calculator;
import gitinit.functions.Sum;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void sumShouldReturnTwo() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.solve(new Sum(1, 1)).intValue());
    }

    @Test
    public void sumShouldReturnADoubleValue() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.solve(new Sum(0.9, 3.1)).intValue());
    }
}
