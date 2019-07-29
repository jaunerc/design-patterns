package ch.travbit.design_patterns.behavioral.command;

public class Invoker {

    private Command command;
    private CommandHistory commandHistory;

    public Invoker() {
        commandHistory = new CommandHistory();
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
        commandHistory.addCommandToHistory(command);
    }

    public void printHistoryLength() {
        System.out.println("Num of commands: " + commandHistory.getHistory().size());
    }
}
