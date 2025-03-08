import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem3 {
    /**
     *
     * @param A
     * @param t
     * @return
     */

    static Set<List<Integer>> twoSum(int[] A, int t) {
        Set<List<Integer>> newSet = new HashSet<>();
        int global_index = 0;
        for (int a : A) {
            int ind = 0;
            while (ind < A.length) {
                if ((ind != global_index) && (a + A[ind] == t) && (!newSet.contains(Arrays.asList(A[ind], a)) && !newSet.contains(Arrays.asList(a, A[ind])))) {
                    newSet.add(Arrays.asList(a, A[ind]));
                }
                ++ind;
            }
            ++global_index;
        }
        return newSet;
    }
}
