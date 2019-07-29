package ch.travbit.design_patterns.behavioral.command;

public class ResetTextCommand implements Command {

    private Receiver receiver;

    public ResetTextCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.resetText();
    }
}
