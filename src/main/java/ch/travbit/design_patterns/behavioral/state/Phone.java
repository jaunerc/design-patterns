package ch.travbit.design_patterns.behavioral.state;

public class Phone {

    private State state;
    private int volume;

    public Phone() {
        state = new ReadyState(this);
        volume = 0;
    }

    public void tapLockButton() {
        state.tapLockButton();
    }

    public void tapVolumeButton() {
        state.tapVolumeButton();
    }

    public void changeState(State state) {
        this.state = state;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
