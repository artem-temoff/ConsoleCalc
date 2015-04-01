import java.util.Scanner;

/**
 * Created by artem on 28.03.2015.
 */
@SuppressWarnings("ALL")
public class StateA extends State {
    public StateA() {
    }

    public static StateA Instance() {
        return new StateA();
    }

    @Override
    public void readNext(Calc a) {
        if(a==null) throw new NullPointerException("No Calc");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        first = Double.parseDouble(word);
        ChangeState(a, StateB.Instance());
    }
}
