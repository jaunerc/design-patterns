package ch.travbit.design_patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Publisher {

    private Map<EventType, List<Subscriber>> subscribers;

    public Publisher() {
        subscribers = new HashMap<>();
        for (EventType type : EventType.values()) {
            subscribers.put(type, new ArrayList<>());
        }
    }

    public void subscribe(EventType type, Subscriber subscriber) {
        List<Subscriber> subscriberList = subscribers.get(type);
        subscriberList.add(subscriber);
    }

    public void notifySubscribers(EventType type) {
        subscribers.get(type).forEach(Subscriber::update);
    }
}
