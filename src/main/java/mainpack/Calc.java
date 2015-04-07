package mainpack;

import states.State;
import states.StateA;

/**
 * Created by Artem  on 28.03.2015.
 */

public class Calc {
    private State state;

    public Calc() {
        state = (new StateA()).instance();
    }

    public void ChangeState(State state) {
        if(state==null) throw new NullPointerException("No state");
        this.state = state;
    }

    public void readNext() {
        state.readNext(this);
    }

}
