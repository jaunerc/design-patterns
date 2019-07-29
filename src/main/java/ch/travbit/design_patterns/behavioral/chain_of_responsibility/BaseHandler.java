package ch.travbit.design_patterns.behavioral.chain_of_responsibility;

public abstract class BaseHandler implements Handler {

    private Handler next;

    public BaseHandler(Handler next) {
        this.next = next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    public void nextHandler(Request request) {
        System.out.println(request.getLastStatus());
        if (next != null) {
            next.handle(request);
        }
    }
}
