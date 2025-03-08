import com.sun.jdi.StringReference;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem3Test {

    @Test
    void replaceAB() {
        String input = "A simple example string with A and more As.";
        String expected = "B simple example string with B and more Bs.";
        assertEquals(expected, Problem3.replaceAB(input));
    }
}