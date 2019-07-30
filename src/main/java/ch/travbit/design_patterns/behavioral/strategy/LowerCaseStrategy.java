package ch.travbit.design_patterns.behavioral.strategy;

public class LowerCaseStrategy implements StringPrintStrategy {
    @Override
    public void print(String data) {
        System.out.println(data.toLowerCase());
    }
}
