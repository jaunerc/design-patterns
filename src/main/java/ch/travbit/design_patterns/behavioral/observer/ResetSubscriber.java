package ch.travbit.design_patterns.behavioral.observer;

public class ResetSubscriber implements Subscriber {
    @Override
    public void update() {
        System.out.println("The data has been reset...");
    }
}
