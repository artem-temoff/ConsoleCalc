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
   void ChangeState(Calc calc, State state) {
        calc.ChangeState(state);
    }

    public void readNext(Calc a) {
    }

}
