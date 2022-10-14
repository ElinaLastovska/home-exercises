package io.codelex.kontrolDarbs.exercise3;

import java.util.function.Function;

public class Joiner<T> {
    private final T first;
    private final String separator;

    private final Function<T, String> Joiner;

    public Joiner(T first, String seperator, Function<T, String> joiner) {
        this.first = first;
        this.separator = seperator;
        Joiner = joiner;
    }

    public String join(int number) {

        String a = first.toString() + separator;
        return a.repeat(number);
    }
}
