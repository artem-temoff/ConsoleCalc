package operations;

/**
 * Created by Artem Eremenko on 07.04.2015.
 */
public class Pow extends Operator {
    public  double calculate(double a, double b) {
        return Math.pow(a,b);
    }
}
