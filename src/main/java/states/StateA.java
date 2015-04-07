package states;

import mainpack.Calc;
import java.util.Scanner;

/**
 * Created by artem on 28.03.2015.
 */

public class StateA extends State {
    public StateA() {
    }

    public StateA instance() {
        return new StateA();
    }

    @Override
    public void readNext(Calc a) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        try {
            State.first = Double.parseDouble(word);
        }catch (Exception e)
        {
            throw new NoSuchNumberInputException();
        }
        ChangeState(a, (new StateB()).instance());
    }
}
