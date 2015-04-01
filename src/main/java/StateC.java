import java.util.Scanner;

/**
 * Created by Artem Eremenko on 28.03.2015.
 */
public class StateC extends State {
    public static StateC Instance() {
        return new StateC();
    }

    @Override
    public void readNext(Calc a) {
        if(a==null) throw new NullPointerException("No Calc");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        second = Double.parseDouble(word);
        switch (operand) {
            case '+':
                first = (new Sum()).calculate(first, second);
                break;
            case '-':
                first = first - second;
                break;
            case '/':
                first = (new Div()).calculate(first, second);
                break;
            case '*':
                first = first * second;
                break;
        }
        operand = '0';
        ChangeState(a, StateB.Instance());
    }
}
