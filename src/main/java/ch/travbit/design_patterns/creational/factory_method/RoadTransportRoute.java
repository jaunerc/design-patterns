package ch.travbit.design_patterns.creational.factory_method;

public class RoadTransportRoute extends TransportRoute {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
