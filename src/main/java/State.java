/**
 * Created by Artem Eremenko on 28.03.2015.
 */
class State {
    static double first;
    static char operand;
    static double second;

    void ChangeState(Calc calc, State state) {
        calc.ChangeState(state);
    }

    public void readNext(Calc a) {
    }

}
