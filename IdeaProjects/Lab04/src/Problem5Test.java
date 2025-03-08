import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem5Test {

    @Test
    void allSelfDividing() {
        assertAll(
                () -> assertEquals (false, Problem5.allSelfDividing( 100)),
                () -> assertEquals(true, Problem5.allSelfDividing( 55)),
                () -> assertEquals(false, Problem5.allSelfDividing( 873))

        );
    }
}