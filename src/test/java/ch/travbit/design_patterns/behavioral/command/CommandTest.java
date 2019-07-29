package ch.travbit.design_patterns.behavioral.command;

import org.junit.jupiter.api.Test;

public class CommandTest {

    @Test
    public void testCommand() {
        Receiver receiver = new Receiver();
        Invoker invoker = new Invoker();

        Command addCommand = new AddTextCommand(receiver, "pseudo");
        Command resetCommand = new ResetTextCommand(receiver);

        invoker.setCommand(addCommand);
        invoker.executeCommand();
        invoker.setCommand(resetCommand);
        invoker.executeCommand();

        invoker.printHistoryLength();
    }
}
