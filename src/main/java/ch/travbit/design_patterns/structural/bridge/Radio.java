package ch.travbit.design_patterns.structural.bridge;

public class Radio extends BasicDevice {

    @Override
    public String getDeviceStatus() {
        if (isEnabled()) {
            return "Radio is playing music";
        }
        return "Silence...";
    }
}
