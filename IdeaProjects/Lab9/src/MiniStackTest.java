import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
/*
partnered with oren
 */

class MiniStackTest {
    @Test
    void add() {
        MiniStack<Integer> input =new MiniStack<>();
        input.add(10);
        input.add(7);
        input.add(4);
        input.add(5);
        assertEquals("5, 4, 7, 10", input.toString());
    }

    @Test
    void peek() {
        MiniStack<Integer> input =new MiniStack<>();
        input.add(10);
        input.add(7);
        input.add(4);
        input.add(5);
        assertEquals(Optional.of(5).get(), input.peek());
    }

    @Test
    void pop() {
        MiniStack<Integer> input =new MiniStack<>();
        input.add(10);
        input.add(7);
        input.add(4);
        input.add(5);
        input.pop();
        assertEquals("4, 7, 10", input.toString());
    }

    @Test
    void size() {
        MiniStack<Integer> input =new MiniStack<>();
        input.add(10);
        input.add(7);
        input.add(4);
        input.add(5);
        assertEquals(4, input.size());
    }

    @Test
    void testToString() {
        MiniStack<Integer> input =new MiniStack<>();
        input.add(10);
        input.add(7);
        input.add(4);
        input.add(5);
        assertEquals("5, 4, 7, 10", input.toString());
    }
}