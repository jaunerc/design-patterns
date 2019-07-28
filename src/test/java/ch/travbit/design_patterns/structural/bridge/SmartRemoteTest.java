package ch.travbit.design_patterns.structural.bridge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SmartRemoteTest {

    @Test
    public void testVolumeOn() {
        Device tv = new TV();
        Remote remote = new SmartRemote(tv);
        remote.powerOn();
        Assertions.assertTrue(tv.isEnabled());
    }
}
