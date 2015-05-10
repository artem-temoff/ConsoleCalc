package mainpack;

import states.State;
import states.StateA;

/**
 * Created by Artem  on 28.03.2015.
 */

//TOOD Calc should be placed with they state classes
public class Calc {
    private State state;

    public Calc() {
        state = (new StateA()).instance();
    }

    //TODO First Capital letter in the method killing me :)
    //TODO Also I think that state pattern isn't applicable here in such manner
    //TODO See example http://www.javacodegeeks.com/2013/08/state-design-pattern-in-java-example-tutorial.html
    public void ChangeState(State state) {
        if(state==null) throw new NullPointerException("No state");
        this.state = state;
    }

    public void readNext() {
        state.readNext(this);
    }

}
