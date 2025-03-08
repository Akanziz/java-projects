import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem1Test {

    @Test
    void gcdTR() {
         assertAll(
                 () -> assertEquals(6, Problem1.gcdTR(6, 0)),
                 () -> assertEquals(4, Problem1.gcdTR(8, 4)),
                 () -> assertEquals(7, Problem1.gcdTR(21, 14))
         );
    }

    @Test
    void gcdLoop() {
        assertAll(
                () -> assertEquals(6, Problem1.gcdTR(12, 6)),
                () -> assertEquals(4, Problem1.gcdTR(8, 4)),
                () -> assertEquals(7, Problem1.gcdTR(21, 14))
        );
    }
}