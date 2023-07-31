import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(5, calculator.Add(2,3) );
    }

    @Test
    public void canSubtract() {
        assertEquals(3, calculator.Subtract(4,1));
    }

    @Test
    public void canMultiply() {
        assertEquals(4, calculator.Multiply(2,2));
    }

    @Test
    public void canDivide() {
        assertEquals(4, calculator.Divide(8,2), 0.01);
    }
}
