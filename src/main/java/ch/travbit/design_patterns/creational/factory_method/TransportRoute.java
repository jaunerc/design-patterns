package ch.travbit.design_patterns.creational.factory_method;

public abstract class TransportRoute {

    public void transportProducts() {
        Transport transport = createTransport();
        transport.deliver();
    }

    public abstract Transport createTransport();
}
