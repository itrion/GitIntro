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

    @Test
    public void multiplyShouldReturnTwentyFive(){
        assertEquals(25, new Calculator().multiply(5, 5));
    }

    @Test
    public void multiplyShouldReturnZero(){
        assertEquals(0, new Calculator().multiply(5, 0));
    }

}
