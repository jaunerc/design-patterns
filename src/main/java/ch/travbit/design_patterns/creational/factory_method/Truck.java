package ch.travbit.design_patterns.creational.factory_method;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Drive on the road...");
    }
}
