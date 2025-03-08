import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem3Test {

    @Test
    void countEvenOdds() {
            assertArrayEquals(new int[]{4,45}, Problem3.countEvenOdds(new int[]{11, 9, 2,3,7,10,12,114}));
    }
}