import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem3Test {

    @Test
    void censor() {
        assertAll(
                () -> assertEquals("***man", Problem3.censor("batman", "bat")),
                () -> assertEquals("bat***", Problem3.censor("batman", "man")),
                () -> assertEquals("b*tm*n",Problem3.censor("batman", "a")),
                () -> assertEquals("batman", Problem3.censor("batman", ""))

        );
    }
}