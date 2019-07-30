package ch.travbit.design_patterns.behavioral.strategy;

import org.junit.jupiter.api.Test;

public class StringPrinterTest {

    @Test
    public void testStringStrategy() {
        StringPrinter printer = new StringPrinter();
        String testString = "A sTriNg to PRINT";
        printer.setStrategy(new UpperCaseStrategy());
        printer.printString(testString);

        printer.setStrategy(new LowerCaseStrategy());
        printer.printString(testString);
    }
}
