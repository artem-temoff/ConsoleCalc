import operations.Div;
import operations.Mul;
import operations.Sub;
import operations.Sum;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by Artem Eremenko on 31.03.2015.
 */

public class OperationTest {

    @Before
    public void setUp() throws Exception {
    }
    @Test
    public void testSumCalculate() throws Exception {
        double result = 5 + (-7);
        double expression = (new Sum()).calculate(5, -7);
        if (result != expression) throw new Exception();
    }

    @Test
    public void testSubCalculate() throws Exception {
        double result = 5-7;
        double expression = (new Sub()).calculate(5, 7);
        if (result != expression) throw new Exception();
    }

    @Test
    public void testMulCalculate() throws Exception {
        double result = 5*7;
        double expression = (new Mul()).calculate(5, 7);
        if (result != expression) throw new Exception();
    }

    @Test
    public void testDivCalculate() throws Exception {
        try {
            (new Div()).calculate(5, 0);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Division by zero");
        }
    }
}