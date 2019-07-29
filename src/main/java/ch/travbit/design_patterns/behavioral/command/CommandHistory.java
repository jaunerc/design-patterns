package ch.travbit.design_patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class CommandHistory {

    private List<Command> history;

    public CommandHistory() {
        history = new ArrayList<>();
    }

    public void addCommandToHistory(Command command) {
        history.add(command);
    }

    public List<Command> getHistory() {
        return history;
    }
}
