import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem4Test {

    @Test
    void replaceABTRHelper() {
        assertEquals("Brrow", Problem4.replaceABTR("Arrow"));
        assertEquals("Bctor", Problem4.replaceABTR("Actor"));
        assertEquals("STBRE", Problem4.replaceABTR("STARE"));
    }
}