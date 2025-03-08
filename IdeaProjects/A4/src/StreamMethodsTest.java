import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StreamMethodsTest {
    @Test
    void removeLonger() {
        assertEquals(Arrays.asList("E", "joe", "bread"), StreamMethods.removeLonger(Arrays.asList("E", "joe", "bread", "coincident", "chickenfries"), 6));
        assertEquals(Arrays.asList("leap"), StreamMethods.removeLonger(Arrays.asList("absence", "officer", "rocket", "capture", "leap"), 5));
        assertEquals(Arrays.asList(), StreamMethods.removeLonger(Arrays.asList("morale", "wilderness", "first"), 1));
        assertEquals(Arrays.asList(), StreamMethods.removeLonger(Arrays.asList(), 4));
        assertEquals(Arrays.asList("recover", "useful", "present", "neighbor"), StreamMethods.removeLonger(Arrays.asList("recover", "useful", "present", "prosecution", "neighbor"), 10));

    }

    @Test
    void sqAddFiveOmit() {
        assertEquals(Arrays.asList(54, 41, 69, 9, 14), StreamMethods.sqAddFiveOmit(Arrays.asList(7,6,8,2,3)));
        assertEquals(Arrays.asList(), StreamMethods.sqAddFiveOmit(Arrays.asList(9, 10)));
        assertEquals(Arrays.asList(), StreamMethods.sqAddFiveOmit(Arrays.asList()));
        assertEquals(Arrays.asList(14), StreamMethods.sqAddFiveOmit(Arrays.asList(3)));
        assertEquals(Arrays.asList(230, 294), StreamMethods.sqAddFiveOmit(Arrays.asList(15, 17, 21)));

    }

    @Test
    void groupLength() {

        assertEquals(Map.of(3, 2,4, 2, 7, 1), StreamMethods.groupLength(Arrays.asList("Kelenna", "Ben", "Will", "Lee", "Alex")));
        assertEquals(Map.of(), StreamMethods.groupLength(Arrays.asList()));
        assertEquals(Map.of(5, 1), StreamMethods.groupLength(Arrays.asList("Emman")));
        assertEquals(Map.of(5, 4), StreamMethods.groupLength(Arrays.asList("Bryce", "Bryce","Bryce","Bryce" )));
        assertEquals(Map.of(1, 1, 2, 1, 6, 2), StreamMethods.groupLength(Arrays.asList("I", "am", "eating", "bread")));
    }


}