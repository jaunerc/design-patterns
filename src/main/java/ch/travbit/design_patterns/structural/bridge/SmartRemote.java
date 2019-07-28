package ch.travbit.design_patterns.structural.bridge;

public class SmartRemote implements Remote {

    private Device device;

    public SmartRemote(Device device) {
        this.device = device;
    }

    @Override
    public void powerOn() {
        device.enable();
    }

    @Override
    public void powerOff() {
        device.disable();
    }

    @Override
    public String getDeviceName() {
        return device.getDeviceStatus();
    }
}
