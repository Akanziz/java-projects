import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem2Test {

    @Test
    void countSTR() {
        assertEquals(3, Problem1.countStr("strstrstr"));
        assertEquals(4, Problem1.countStr("strstrstrstr"));
        assertEquals(1, Problem1.countStr("str"));
    }
}