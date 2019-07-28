package ch.travbit.design_patterns.structural.bridge;

public class TV extends BasicDevice {

    @Override
    public String getDeviceStatus() {
        if (isEnabled()) {
            return "Smart TV is on";
        }
        return "Smart TV is off";
    }
}
