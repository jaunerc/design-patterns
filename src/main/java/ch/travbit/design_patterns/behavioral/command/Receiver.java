package ch.travbit.design_patterns.behavioral.command;

public class Receiver {

    private final String defaultText = "Empty";

    private String text;

    public Receiver() {
        resetText();
    }

    public void addText(String txt) {
        text += ", " + txt;
    }

    public void resetText() {
        text = defaultText;
    }
}
