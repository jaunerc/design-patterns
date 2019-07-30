package ch.travbit.design_patterns.behavioral.strategy;

public class UpperCaseStrategy implements StringPrintStrategy {
    @Override
    public void print(String data) {
        System.out.println(data.toUpperCase());
    }
}
