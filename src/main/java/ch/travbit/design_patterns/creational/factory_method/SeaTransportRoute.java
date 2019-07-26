package ch.travbit.design_patterns.creational.factory_method;

public class SeaTransportRoute extends TransportRoute {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
