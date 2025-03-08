import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class Problem2Test {

    @Test
    void categorize() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("x", 1);
        map.put("hello", 5);
        map.put("world", 5);
        map.put("hi", 2);

        ArrayList<TreeSet<String>> result = Problem2.categorize(map);

        assertEquals(6, result.size(), "Incorrect number of categories");

        assertEquals(0, result.get(0).size(), "Category 0 size should be 0");

        assertEquals(1, result.get(1).size(), "Category 1 size should be 1");
        assertTrue(result.get(1).contains("x"), "Category 1 should contain 'x'");

        assertEquals(1, result.get(2).size(), "Category 2 size is 1");
        assertTrue(result.get(2).contains("hi"), "Category 2 should contains 'hi'");

        assertEquals(2, result.get(5).size(), "Category 5 size is 2");
        assertTrue(result.get(5).contains("hello"), "Category 5  contains 'hello'");
        assertTrue(result.get(5).contains("world"), "Category 5 contains 'world'");
    }
}