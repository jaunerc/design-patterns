package ch.travbit.design_patterns.behavioral.chain_of_responsibility;

public class HandlerC extends BaseHandler {
    public HandlerC(Handler next) {
        super(next);
    }

    @Override
    public void handle(Request request) {
        request.setLastStatus("handled by C");
        nextHandler(request);
    }
}
