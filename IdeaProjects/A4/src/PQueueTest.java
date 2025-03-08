import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PQueueTest {
    @Test
    void enqueueTests() {
        PQueue<String> q1 = PQueue.of("A", "B", "C", "D");
        PQueue<String> q2 = PQueue.of("A", "B", "C", "D", "E");
        PQueue<String> q3 = PQueue.of("A", "B", "C", "D", "hello");
        PQueue<String> q4 = PQueue.of("A", "B", "C", "D", "E", "F");
        PQueue<String> q5 = PQueue.of();
        PQueue<String> q6 = PQueue.of("a");

        assertEquals(q2, q1.enqueue("E"));
        assertEquals(q3, q1.enqueue("hello"));
        assertEquals(q4, q1.enqueue("E").enqueue("F"));
        assertEquals(q6, q5.enqueue("a"));
        assertEquals(new PQueue<>(), q5);
    }

    @Test
    void dequeueTests() {
        PQueue<String> q1 = PQueue.of("A", "B", "C", "D");
        PQueue<String> q2 = PQueue.of("B", "C", "D");
        PQueue<String> q3 = PQueue.of("A", "B", "C", "D", "hello");
        PQueue<String> q4 = PQueue.of("C", "D");
        PQueue<String> q5 = PQueue.of();
        PQueue<String> q6 = PQueue.of("a");

        assertEquals(q2, q1.dequeue());
        assertEquals(q3, q1.dequeue().dequeue());
        assertEquals(q5, q5.dequeue());
        assertEquals(new PQueue<String>(), q5.dequeue());
        assertEquals(q5, q6.dequeue());
    }
}