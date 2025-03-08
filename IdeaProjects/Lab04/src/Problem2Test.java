import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem2Test {

    @Test
    void containsMiddleABC() {
        assertAll(
                () -> assertEquals(true, Problem2.containsMiddleABC("helloABChiya!")),
                () -> assertEquals(true, Problem2.containsMiddleABC("ABC")),
                () -> assertEquals(false, Problem2.containsMiddleABC("notInTheMiddleABCmid!"))
        );
    }
}