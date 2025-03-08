import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem3Test {

    @Test
    void filterThenSquare() {
        List<Double> input = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0);
        List<Double> expected = List.of(4.0, 16.0, 36.0);

        List<Double> result = Problem3.filterThenSquare(input);

        assertEquals(expected, result);
    }
}