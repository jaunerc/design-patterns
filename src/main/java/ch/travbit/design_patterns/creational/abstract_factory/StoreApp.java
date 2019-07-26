package ch.travbit.design_patterns.creational.abstract_factory;


public class StoreApp {

    private FurnitureFactory factory;

    public StoreApp(FurnitureFactory factory) {
        this.factory = factory;
    }

    public Chair buyChair() {
        return factory.createChair();
    }

    public Sofa buySofa() {
        return factory.createSofa();
    }
}
