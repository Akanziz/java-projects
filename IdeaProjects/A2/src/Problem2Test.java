import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem2Test {

    @Test
    void subfactorial() {
        assertAll(
                () -> assertEquals(44, Problem2.subfactorialLoop(5)),
                () -> assertEquals(0, Problem2.subfactorialLoop(1)),
                () -> assertEquals(1334961, Problem2.subfactorialLoop(10))
        );
    }

    @Test
    void subfactorialTR() {
        assertAll(
                () -> assertEquals(44, Problem2.subfactorialLoop(5)),
                () -> assertEquals(0, Problem2.subfactorialLoop(1)),
                () -> assertEquals(1334961, Problem2.subfactorialLoop(10))
        );
    }


    @Test
    void subfactorialLoop() {
        assertAll(
                () -> assertEquals(44, Problem2.subfactorialLoop(5)),
                () -> assertEquals(0, Problem2.subfactorialLoop(1)),
                () -> assertEquals(1334961, Problem2.subfactorialLoop(10))
        );
    }
}



