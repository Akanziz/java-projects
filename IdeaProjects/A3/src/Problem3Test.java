import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class Problem3Test {

    @Test
    void twoSum() {
        Set<List<Integer>> ans1 = new HashSet<>();
        List<Integer> list1 = Arrays.asList(2, 2);
        List<Integer> list2 = Arrays.asList(6, -2);
        ans1.add(list1);
        ans1.add(list2);

        assertEquals(ans1, Problem3.twoSum(new int[]{2,2,4,6,10,-2}, 4));
    }
}