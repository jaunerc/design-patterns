package ch.travbit.design_patterns.creational.prototype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarPrototypeTest {

    @Test
    public void testPrototype() {
        CarPrototype prototype = new CarPrototype();
        prototype.setFourWheelDrive(true);
        CarPrototype second = new CarPrototype();

        try {
            second = (CarPrototype) prototype.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(second.isFourWheelDrive());
    }
}
