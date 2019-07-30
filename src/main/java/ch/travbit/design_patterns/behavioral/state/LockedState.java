package ch.travbit.design_patterns.behavioral.state;

public class LockedState extends BasicState {

    public LockedState(Phone phone) {
        super(phone);
    }

    @Override
    public void tapLockButton() {
        getPhone().changeState(new ReadyState(getPhone()));
    }

    @Override
    public void tapVolumeButton() {
        throw new IllegalStateException("Phone is locked, unable to change the volume.");
    }
}
