import java.util.Scanner;

/**
 * Created by Artem Eremenko on 28.03.2015.
 */
public class StateB extends State {
    public static StateB Instance() {
        return new StateB();
    }

    @Override
    public void readNext(Calc a) {
        if(a==null) throw new NullPointerException("No Calc");
        System.out.println(first);
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        operand = word.charAt(0);
        switch (operand) {
            case 's':
                ChangeState(a, StateB.Instance());
                first = Math.sin(first);
                break;
            case 'c':
                ChangeState(a, StateB.Instance());
                first = Math.cos(first);
                break;
            default:
                ChangeState(a, StateC.Instance());
        }


    }
}
