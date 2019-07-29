package ch.travbit.design_patterns.behavioral.chain_of_responsibility;

public class HandlerB extends BaseHandler {
    public HandlerB(Handler next) {
        super(next);
    }

    @Override
    public void handle(Request request) {
        request.setLastStatus("handled by B");
        nextHandler(request);
    }
}
