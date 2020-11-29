package se.iths.textprocessor;

import se.iths.calculator.Calculator;

public class TextProcessor {

    public String textToUpperCase(String text) {
        return text.toUpperCase();
    }

    public String textToLowerCase(String text) {

        return text.toLowerCase();
    }

    public String textReverse(String text) {
        return new StringBuilder(text).reverse().toString();
    }


}
