package com.aya.testing;

/**
 * @author Artem
 * @date 03.06.2018
 */
public class SimpleGame {
    public String play(int number) {
        if (number == 0) throw new IllegalArgumentException("");
        if (isMultipleOf(number, 3) && isMultipleOf(number, 5)) return "FooBoo";
        if (isMultipleOf(number, 3)) return "Foo";
        if (isMultipleOf(number, 5)) return "Boo";

        return String.valueOf(number);
    }

    private boolean isMultipleOf(int number, int i) {
        return number % i == 0;
    }
}
