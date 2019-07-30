package ch.travbit.design_patterns.behavioral.strategy;

public class StringPrinter {

    private StringPrintStrategy strategy;

    public void setStrategy(StringPrintStrategy strategy) {
        this.strategy = strategy;
    }

    public void printString(String data) {
        strategy.print(data);
    }
}
