import gitinit.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void shouldReturnTwo(){
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.sum(1, 1));
    }

    @Test
    public void shouldReturnFour(){
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.sum(2, 2));
    }

}
