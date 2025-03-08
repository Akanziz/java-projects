import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem9Test {

    @Test
    void stringifyList() {
        List<Double> doubleList = new ArrayList<>(Arrays.asList(1.5, 2.5, 3.5));
        assertEquals("1.5, 2.5, 3.5", Problem9.stringifyList(doubleList));

        List<Character> charList = new ArrayList<>(Arrays.asList('a', 'b', 'c'));
        assertEquals("a, b, c", Problem9.stringifyList(charList));

        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals("1, 2, 3, 4, 5", Problem9.stringifyList(intList));

        List<String> stringList = new ArrayList<>(Arrays.asList("apple", "banana", "orange"));
        assertEquals("apple, banana, orange", Problem9.stringifyList(stringList));
    }
}