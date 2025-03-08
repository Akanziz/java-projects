import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class Problem6Test {

    @Test
    void wordCount() {
        String input1 = "Hello world, the world is healthy, is it not? I certainly agree that the world is #1 and healthy.";
        HashMap<String, Integer> expected1 = new HashMap<>();
        expected1.put("hello", 1);
        expected1.put("world", 3);
        expected1.put("the", 2);
        expected1.put("is", 3);
        expected1.put("healthy", 2);
        expected1.put("it", 1);
        expected1.put("i", 1);
        expected1.put("certainly", 1);
        expected1.put("agree", 1);
        expected1.put("that", 1);
        expected1.put("1", 1);
        expected1.put("and", 1);
        expected1.put("not", 1);

        HashMap<String, Integer> result1 = Problem6.wordCount(input1);
        assertEquals(expected1, result1);
    }
}