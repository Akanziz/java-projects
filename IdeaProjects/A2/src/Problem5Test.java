import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem5Test {

    @Test
    void compareTo() {
        assertAll(
                () -> assertEquals(1, Problem5.compareTo("b", "a")),
                () -> assertEquals(-1, Problem5.compareTo("no", "shot")),
                () -> assertEquals(0, Problem5.compareTo("no", "no"))
        );
    }
}