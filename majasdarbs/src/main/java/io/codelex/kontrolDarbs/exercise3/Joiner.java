package io.codelex.kontrolDarbs.exercise3;

public class Joiner<T> {
    private final String separator;


    public Joiner(String separator) {
        this.separator = separator;
    }

    @SafeVarargs
    public final String join(T... args) {

        String result = "", prefix = "";
        for (T s : args) {
            result += prefix + s;
            prefix = separator;
        }
        return result;
    }
}
