package ch.travbit.design_patterns.behavioral.state;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StateTest {

    @Test
    public void testReadyState() {
        Phone phone = new Phone();
        phone.tapVolumeButton();
        Assertions.assertEquals(1, phone.getVolume());
    }

    @Test
    public void testLockedState() {
        Phone phone = new Phone();
        phone.changeState(new LockedState(phone));
        Assertions.assertThrows(IllegalStateException.class, phone::tapVolumeButton);
    }
}
