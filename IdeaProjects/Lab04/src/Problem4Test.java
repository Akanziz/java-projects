import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem4Test {

    @Test
    void isSelfDividing() {
        assertAll(
                () -> assertEquals(false, Problem4.isSelfDividing(0)),
                () -> assertEquals(true, Problem4.isSelfDividing(10)),
                () -> assertEquals(false, Problem4.isSelfDividing(873))

        );
    }

}