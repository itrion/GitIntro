import gitinit.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void shouldReturnTwo(){
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.sum(1, 1));
    }
}
