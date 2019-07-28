package ch.travbit.design_patterns.structural.bridge;

public interface Device {

    boolean isEnabled();

    void enable();

    void disable();

    String getDeviceStatus();
}
