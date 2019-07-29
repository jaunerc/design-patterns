package ch.travbit.design_patterns.behavioral.chain_of_responsibility;

import org.junit.jupiter.api.Test;

public class ChainOfResponsibilityTest {

    @Test
    public void testChain() {
        Handler hC = new HandlerC(null);
        Handler hB = new HandlerB(hC);
        Handler hA = new HandlerA(hB);
        Request pseudoRequest = new Request();
        hA.handle(pseudoRequest);
    }
}
