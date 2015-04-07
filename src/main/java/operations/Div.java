package operations;

/**
 * Created by Artem Eremenko on 01.04.2015.
 */
public class Div extends Operator {
    public  double calculate(double a, double b) {
        if(b==0) throw new DivisionByZero("error in division operator");
        return a / b;
    }
}
