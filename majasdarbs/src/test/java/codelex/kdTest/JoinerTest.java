package codelex.kdTest;

import io.codelex.kontrolDarbs.exercise3.Joiner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class JoinerTest {

    @Test
    void testJoinInteger() {
        Joiner<Integer> a = new Joiner<>(2, "*", (c) -> c + "*");
        String result = a.join(3);
        Assertions.assertEquals("2*2*2*", result);
    }

    @Test
    void testJoinString() {
        Joiner<String> a = new Joiner<>("b", "-", (c) -> c + "-");
        String result = a.join(3);
        Assertions.assertEquals("b-b-b-", result);
    }

    @Test
    void testJoinStringMuchTimes() {
        Joiner<String> a = new Joiner<>("Much", "-", (c) -> c + "-");
        String result = a.join(5);
        Assertions.assertEquals("Much-Much-Much-Much-Much-", result);
    }
}

