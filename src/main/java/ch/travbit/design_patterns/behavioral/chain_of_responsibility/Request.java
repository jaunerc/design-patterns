package ch.travbit.design_patterns.behavioral.chain_of_responsibility;

public class Request {

    private String lastStatus;

    public Request() {
        lastStatus = "New";
    }

    public String getLastStatus() {
        return lastStatus;
    }

    public void setLastStatus(String lastStatus) {
        this.lastStatus = lastStatus;
    }
}
