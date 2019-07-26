package ch.travbit.design_patterns.creational.abstract_factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StoreAppTest {

    @Test
    void testModernType() {
        StoreApp app = new StoreApp(new ModernFurnitureFactory());
        assertTrue(app.buyChair() instanceof ModernChair);
        assertTrue(app.buySofa() instanceof ModernSofa);
    }

    @Test
    void testVictorianType() {
        StoreApp app = new StoreApp(new VictorianFurnitureFactory());
        assertTrue(app.buyChair() instanceof VictorianChair);
        assertTrue(app.buySofa() instanceof VictorianSofa);
    }
}
