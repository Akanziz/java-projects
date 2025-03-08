import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem10Test {

    @Test
    void areParallelLists() {
        // Parallel lists with positive numbers
        List<Integer> t1 = new ArrayList<>(Arrays.asList(5, 10, 15, 20));
        List<Integer> u1 = new ArrayList<>(Arrays.asList(20, 40, 60, 80));
        assertTrue(Problem10.areParallelLists(t1, u1));

        // Parallel lists with negative numbers
        List<Integer> t2 = new ArrayList<>(Arrays.asList(-3, -6, -9, -12));
        List<Integer> u2 = new ArrayList<>(Arrays.asList(-15, -30, -45, -60));
        assertTrue(Problem10.areParallelLists(t2, u2));

        // Parallel lists with zero
        List<Integer> t3 = new ArrayList<>(Arrays.asList(0, 0, 0, 0));
        List<Integer> u3 = new ArrayList<>(Arrays.asList(0, 0, 0, 0));
        assertTrue(Problem10.areParallelLists(t3, u3));

        // Parallel lists with one element
        List<Integer> t4 = new ArrayList<>(Arrays.asList(5));
        List<Integer> u4 = new ArrayList<>(Arrays.asList(15));
        assertTrue(Problem10.areParallelLists(t4, u4));

        // Non-parallel lists
        List<Integer> t5 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> u5 = new ArrayList<>(Arrays.asList(2, 3, 4));
        assertFalse(Problem10.areParallelLists(t5, u5));

        // Lists with large numbers
        List<Integer> t7 = new ArrayList<>(Arrays.asList(Integer.MAX_VALUE - 1, Integer.MAX_VALUE));
        List<Integer> u7 = new ArrayList<>(Arrays.asList(Integer.MAX_VALUE, Integer.MAX_VALUE + 1));
        assertFalse(Problem10.areParallelLists(t7, u7));

        // Edge case: Lists with large negative numbers
        List<Integer> t8 = new ArrayList<>(Arrays.asList(Integer.MIN_VALUE + 2, Integer.MIN_VALUE));
        List<Integer> u8 = new ArrayList<>(Arrays.asList(Integer.MIN_VALUE, Integer.MIN_VALUE - 2));
        assertFalse(Problem10.areParallelLists(t8, u8));

        // Edge case: Lists with alternating positive and negative numbers
        List<Integer> t9 = new ArrayList<>(Arrays.asList(1, -1, 1, -1));
        List<Integer> u9 = new ArrayList<>(Arrays.asList(2, -2, 2, -2));
        assertTrue(Problem10.areParallelLists(t9, u9));
    }
}