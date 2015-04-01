/**
 * Created by Artem Eremenko on 28.03.2015.
 */
class Calc {
    State state;

    public Calc() {
        state = StateA.Instance();
    }

    void ChangeState(State state) {
        if(state==null) throw new NullPointerException("No state");
        this.state = state;
    }

    public void readNext() {
        state.readNext(this);
    }

}
