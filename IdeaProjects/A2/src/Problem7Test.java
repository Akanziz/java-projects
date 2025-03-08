import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem7Test {

    @Test
    void countPairs() {
        assertAll(
                () -> assertEquals(0, Problem7.countPairs(1)),
                () -> assertEquals(2, Problem7.countPairs(5)),
                () -> assertEquals(3, Problem7.countPairs(10))
        );
    }
}