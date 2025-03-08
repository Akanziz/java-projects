import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem2Test {

    @Test
    void median() {
            assertAll(
                    () -> assertEquals(3, Problem2.median(new int[]{1, 3, 5}, new int[]{2, 4, 6})),
                    () -> assertEquals(2, Problem2.median(new int[]{3}, new int[]{2})),
                    () -> assertEquals(4, Problem2.median(new int[]{1, 3, 5, 7}, new int[]{2, 4, 6})),
                    () -> assertEquals(4, Problem2.median(new int[]{1, 2, 3}, new int[]{4, 5, 6, 7}))
            );
        }
    }