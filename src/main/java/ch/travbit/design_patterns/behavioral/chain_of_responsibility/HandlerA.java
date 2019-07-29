package ch.travbit.design_patterns.behavioral.chain_of_responsibility;

public class HandlerA extends BaseHandler {

    public HandlerA(Handler next) {
        super(next);
    }

    @Override
    public void handle(Request request) {
        request.setLastStatus("handled by A");
        nextHandler(request);
    }
}
