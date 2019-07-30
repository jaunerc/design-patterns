package ch.travbit.design_patterns.behavioral.state;

public abstract class BasicState implements State {

    private Phone phone;

    public BasicState(Phone phone) {
        this.phone = phone;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }
}
