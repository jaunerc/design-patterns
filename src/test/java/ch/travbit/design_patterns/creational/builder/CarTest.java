package ch.travbit.design_patterns.creational.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarTest {

    @Test
    public void testCarBuilder() {
        Car car = new Car.Builder().setNumDoors(4)
                .setMaxSpeedMph(120)
                .setColorName("red")
                .build();
        assertTrue(true);
    }
}
