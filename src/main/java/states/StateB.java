package states;

import mainpack.Calc;
import operations.Div;
import java.util.Scanner;


/**
 * Created by Artem Eremenko on 28.03.2015.
 */
public class StateB extends State {
    public  StateB instance() {
        return new StateB();
    }

    @Override
    public void readNext(Calc a) {
        System.out.println(State.first);
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();               //read operation
        State.operand= new Div();
        if((State.operand = State.operand.createOperator(word))==null){
            throw new NoSuchOperationInputException();
        }
        ChangeState(a, (new StateC()).instance());
    }

}
