package ch.travbit.design_patterns.behavioral.observer;

public class App {

    private final String defaultData = "default";

    private Publisher publisher;
    private String data;

    public App() {
        publisher = new Publisher();
        publisher.subscribe(EventType.MODIFY, new ModifySubscriber());
        publisher.subscribe(EventType.RESET, new ResetSubscriber());

        resetData();
    }

    public void resetData() {
        data = defaultData;
        publisher.notifySubscribers(EventType.RESET);
    }

    public void addData(String text) {
        data += ", " + text;
        publisher.notifySubscribers(EventType.MODIFY);
    }
}
