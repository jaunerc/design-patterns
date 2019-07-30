package ch.travbit.design_patterns.behavioral.state;

public class ReadyState extends BasicState {

    private final static int MAX_VOLUME = 10;

    public ReadyState(Phone phone) {
        super(phone);
    }

    @Override
    public void tapLockButton() {
        getPhone().changeState(new LockedState(getPhone()));
    }

    @Override
    public void tapVolumeButton() {
        int v = getPhone().getVolume();
        if (v < MAX_VOLUME) {
            v++;
        } else {
            v = 0;
        }
        getPhone().setVolume(v);
    }
}
