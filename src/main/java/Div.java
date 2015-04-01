/**
 * Created by Artem Eremenko on 01.04.2015.
 */
public class Div implements BinOp {
    public static double calculate(double a, double b) {
        if(b==0) throw new ArithmeticException("division by zero");
        return a / b;

    }


}
