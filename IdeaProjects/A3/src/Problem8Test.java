import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Problem8Test {

    @Test
    void postfixEvaluator() {
        assertAll(
                () -> assertEquals(17, Problem8.postfixEvaluator(Arrays.asList("5", "2", "*", "5", "+", "2", "+"))),
                () -> assertEquals(32, Problem8.postfixEvaluator(Arrays.asList("2", "2", "2", "2", "2", "*", "*", "*", "*"))),
                () -> assertEquals(10, Problem8.postfixEvaluator(Arrays.asList("1", "2", "3", "4", "+", "+", "+"))),
                () -> assertEquals(9, Problem8.postfixEvaluator(Arrays.asList("2", "2", "*", "5", "+")))

        );
    }
}