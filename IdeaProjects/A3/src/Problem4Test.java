import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem4Test {

    @Test
    void peakFinder() {
        int[] test5 = {};
        int[] ans5 = {};
        assertArrayEquals(ans5, Problem4.peakFinder(test5));

        int[] test2 = {8, 7, 8, 7, 8, 7, 8, 7};
        int[] ans2 = {8};
        assertArrayEquals(ans2, Problem4.peakFinder(test2));

        int[] test3 = {111, 27, 84, 31, 5, 9, 4, 3, 2, 1, 64};
        int[] ans3 = {84, 9};
        assertArrayEquals(ans3, Problem4.peakFinder(test3));

        int[] test1 = {9, 13, 7, 2, 8};
        int[] ans1 = {13};
        assertArrayEquals(ans1, Problem4.peakFinder(test1));
    }
}