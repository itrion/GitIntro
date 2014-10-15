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
    public void substractionThatShouldReturnThree() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.substract(5,2));
    }

    @Test
    public void substractionThatShouldReturnFive() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.substract(10,5));
    }

    @Test
    public void divisionThatShouldReturnTwo() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(4, 2));
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
