package ch.travbit.design_patterns.structural.bridge;

public abstract class BasicDevice implements Device {

    private boolean enabled;

    public BasicDevice() {
        enabled = false;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void enable() {
        enabled = true;
    }

    @Override
    public void disable() {
        enabled = false;
    }
}
