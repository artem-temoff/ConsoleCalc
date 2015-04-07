package states;

import mainpack.Calc;
import java.util.Scanner;

/**
 * Created by Artem Eremenko on 28.03.2015.
 */
public class StateC extends State {
    public  StateC instance() {
        return new StateC();
    }

    @Override
    public void readNext(Calc a) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();                   //read number
        try {
            State.second = Double.parseDouble(word);
        }catch (Exception e)
        {
            throw new NoSuchNumberInputException();
        }
        State.first=State.operand.calculate(first,second);

        State.operand = null;
        ChangeState(a, (new StateB()).instance());
    }
}
