import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem4Test {

    @Test
    void shift() {

        assertIterableEquals(List.of("12", "13", "14", "11"), Problem4.shift(new ArrayList<>(List.of("11", "12", "13", "14")), -1));
        assertIterableEquals(List.of("140", "140", "120", "120"), Problem4.shift(new ArrayList<>(List.of("120", "120", "140", "140")), 2));
        assertIterableEquals(List.of("99999999"), Problem4.shift(new ArrayList<>(List.of("99999999")), 1000 ));
        assertIterableEquals(new ArrayList(), Problem4.shift(new ArrayList(), -9999999));
        assertIterableEquals(List.of("50", "40", "20","120", "80", "70"), Problem4.shift(new ArrayList<>(List.of("120", "80", "70", "50", "40", "20")),
        assertIterableEquals(List.of("120", "80"), Problem4.shift(new ArrayList<>(List.of("80", "120")), -1));
    }
}

