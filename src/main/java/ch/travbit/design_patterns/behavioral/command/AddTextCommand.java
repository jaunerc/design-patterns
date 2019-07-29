package ch.travbit.design_patterns.behavioral.command;

public class AddTextCommand implements Command{

    private Receiver receiver;
    private String additionalText;

    public AddTextCommand(Receiver receiver, String additionalText) {
        this.receiver = receiver;
        this.additionalText = additionalText;
    }

    @Override
    public void execute() {
        receiver.addText(additionalText);
    }
}
