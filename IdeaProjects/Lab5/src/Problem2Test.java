import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Problem2Test {

    @Test
    void sumNasty() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(8);
        list1.add(7);
        list1.add(11);
        list1.add(9);
        list1.add(12);
        list1.add(10);
        assertEquals(9.0, Problem2.sumNasty(list1));
    }
}