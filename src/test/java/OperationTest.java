import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by Artem Eremenko on 31.03.2015.
 */
public class OperationTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();

    }

    @Test
    public void testSumCalculate() throws Exception {
        double result = 5 + (-7);
        double expression = Sum.calculate(5, -7);
        if (result != expression) throw new Exception();
    }

    @Test
    public void testDivCalculate() throws Exception {
        try {
            Div.calculate(5, 0);
        } catch (ArithmeticException e) {
        }
    }
}