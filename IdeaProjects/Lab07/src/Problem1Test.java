import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem1Test {

    @org.junit.jupiter.api.Test
    void conjoin() {
        List<String> list = List.of("apple", "banana", "orange", "grape");
        String expected = "apple,banana,orange,grape";

        String result = Problem1.conjoin(list);

        assertEquals(expected, result);


    }
}