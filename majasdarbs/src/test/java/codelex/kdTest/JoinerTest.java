package codelex.kdTest;

import io.codelex.kontrolDarbs.exercise3.Joiner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JoinerTest {

    @Test
    void testJoinInteger() {
        Joiner<Object> joiner = new Joiner<>("x");
        String result = joiner.join(1, 2, 3);
        Assertions.assertEquals("1x2x3", result);
    }

    @Test
    void testJoinString() {
        Joiner<Object> joiner = new Joiner<>("-");
        String result = joiner.join("a", "b", "c");
        Assertions.assertEquals("a-b-c", result);
    }

    @Test
    void testJoinChar() {

        Joiner<Object> joiner = new Joiner<>("()");
        String result = joiner.join('%', '^', '#');
        Assertions.assertEquals("%()^()#", result);
    }
}

