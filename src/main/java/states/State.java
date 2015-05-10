package states;
import mainpack.Calc;
import operations.Operator;

/**
 * Created by Artem Eremenko on 28.03.2015.
 */
public class State {
    static double first;
    static Operator operand;
    static double second;

    //TODO What is that??? method has name starting with capital letter? Very rood mistake (-1 point)
   void ChangeState(Calc calc, State state) {
        calc.ChangeState(state);
    }

    public void readNext(Calc a) {
    }

}
