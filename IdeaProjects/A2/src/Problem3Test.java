import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem3Test {

    @Test
    void collatz() {
        assertAll(
                () -> assertEquals("5,16,8,4,2,1", Problem3.collatz(5)),
                () -> assertEquals("10,5,16,8,4,2,1", Problem3.collatz(10)),
                () -> assertEquals("1", Problem3.collatz(1))
        );
    }

    @Test
    void collatzTR() {
        assertAll(
                () -> assertEquals("5,16,8,4,2,1", Problem3.collatzTR(5)),
                () -> assertEquals("10,5,16,8,4,2,1", Problem3.collatzTR(10)),
                () -> assertEquals("1", Problem3.collatzTR(1))
        );
    }

    @Test
    void collatzLoop() {
        assertAll(
                () -> assertEquals("5,16,8,4,2,1", Problem3.collatzLoop(5)),
                () -> assertEquals("10,5,16,8,4,2,1", Problem3.collatzLoop(10)),
                () -> assertEquals("1", Problem3.collatzLoop(1))
        );
    }
}