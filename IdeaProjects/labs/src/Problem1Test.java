import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem1Test {

    @Test
    void userId() {
        assertEquals("CrottJ99", Problem1.userId("Joshua", "Crotts", 1999));
    }
}