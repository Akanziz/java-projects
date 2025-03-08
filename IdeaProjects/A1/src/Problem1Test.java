import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem1Test {

    @Test
    void gigameterTosecond() {
        assertEquals(3335.64, Problem1.gigameterTosecond(1000), 0.01);
        assertEquals(6671.28, Problem1.gigameterTosecond(2000), 0.01 );
        assertEquals(10006.92,Problem1.gigameterTosecond(3000), 0.01);
    }
}