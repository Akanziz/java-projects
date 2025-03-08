import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashSet;

import static org.junit.jupiter.api.Assertions.*;

class Problem7Test {

    @Test
    void largeToSmall() {
        String input1 = "Hello world, the world is healthy, is it not? I certainly agree that the world is #1 and healthy.";
        LinkedHashSet<String> expected1 = new LinkedHashSet<>();
        expected1.add("world");
        expected1.add("is");
        expected1.add("the");
        expected1.add("healthy");
        expected1.add("hello");
        expected1.add("it");
        expected1.add("i");
        expected1.add("certainly");
        expected1.add("agree");
        expected1.add("that");
        expected1.add("1");
        expected1.add("and");
        expected1.add("not");

        HashMap<String, Integer> result1 = Problem6.wordCount(input1);
        LinkedHashSet<String> result2 = Problem7.largeToSmall(result1);

        assertEquals(expected1, result2);
    }
}