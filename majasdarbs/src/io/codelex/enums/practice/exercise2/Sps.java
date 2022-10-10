package io.codelex.enums.practice.exercise2;

import java.util.Random;

public enum Sps {
    SCISSOR,
    PAPER,
    STONE,
    Q;


    private static final Random PRNG = new Random();


    public static Sps randomSps() {
        Sps[] sps = values();
        return sps[PRNG.nextInt(2)];
    }

}
