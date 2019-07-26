package ch.travbit.design_patterns.creational.factory_method;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Shipping on the sea...");
    }
}
