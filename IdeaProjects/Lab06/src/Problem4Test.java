import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;

import static org.junit.jupiter.api.Assertions.*;

class Problem4Test {

    @Test
    void pqToString() {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("cat");
        pq.add("dog");
        pq.add("mouse");

        String result = Problem4.pqToString(pq);
        String expected = "{cat,dog,mouse}";

        assertEquals("{}", Problem4.pqToString(new PriorityQueue<>()));
    }
}