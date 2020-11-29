package se.iths.main;

import se.iths.calculator.Calculator;
import se.iths.textprocessor.TextProcessor;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println(calculator.add(2, 3));

        TextProcessor textProcessor = new TextProcessor();

        System.out.println(textProcessor.textReverse("Reverse me!"));

    }

}
