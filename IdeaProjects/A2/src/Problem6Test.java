import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem6Test {

    @Test
    void strSumNums() {
        assertAll(
                () -> assertEquals(0, Problem6.strSumNums("Emmanuel")),
                () -> assertEquals(837, Problem6.strSumNums("837")),
                () -> assertEquals(55, Problem6.strSumNums("17! 38! AY!"))
        );
    }
}