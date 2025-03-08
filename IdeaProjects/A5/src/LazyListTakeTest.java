import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LazyListTakeTest {

    @Test
    void testLazyListTake() {

        LazyListTake llt2 = new LazyListTake(new FibonacciLazyList(), 10);
        assertAll(
                () -> assertEquals("[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]", llt2.getList().toString()));
    }
}