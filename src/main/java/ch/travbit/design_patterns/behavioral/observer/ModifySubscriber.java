package ch.travbit.design_patterns.behavioral.observer;

public class ModifySubscriber implements Subscriber {
    @Override
    public void update() {
        System.out.println("The data was modified.");
    }
}
