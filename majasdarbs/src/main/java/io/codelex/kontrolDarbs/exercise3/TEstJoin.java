package io.codelex.kontrolDarbs.exercise3;

public class TEstJoin {
    public static void main(String[] args) {
        Joiner a = new Joiner<>("A", "-", (c) -> c + "-");
        System.out.println(a.join(4));

    }
}
