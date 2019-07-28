package ch.travbit.design_patterns.creational.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingletonTest {

    @Test
    public void testSingleton() {
        Singleton singleton = Singleton.getInstance();
        Assertions.assertNotNull(singleton);
    }
}
