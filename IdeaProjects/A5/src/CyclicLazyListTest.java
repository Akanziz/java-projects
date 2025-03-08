import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CyclicLazyListTest {

    @Test
    void testCyclicLazyList() {

        CyclicLazyList<Integer> cyclicList1 = new CyclicLazyList<>(1, 2, 3);
        assertAll(
                () -> assertEquals(1, cyclicList1.next()),
                () -> assertEquals(2, cyclicList1.next()),
                () -> assertEquals(3, cyclicList1.next()),
                () -> assertEquals(1, cyclicList1.next()),
                () -> assertEquals(2, cyclicList1.next())
        );


        CyclicLazyList<String> cyclicList2 = new CyclicLazyList<>("A", "B", "D");
        assertAll(
                () -> assertEquals("A", cyclicList2.next()),
                () -> assertEquals("B", cyclicList2.next()),
                () -> assertEquals("D", cyclicList2.next()),
                () -> assertEquals("A", cyclicList2.next()),
                () -> assertEquals("B", cyclicList2.next())
        );
    }
}
