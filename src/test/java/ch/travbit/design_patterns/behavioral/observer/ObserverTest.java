package ch.travbit.design_patterns.behavioral.observer;

import org.junit.jupiter.api.Test;

public class ObserverTest {

    @Test
    public void testObserver() {
        App app = new App();
        app.addData("A");
        app.addData("B");
        app.addData("C");
        app.resetData();
    }
}
