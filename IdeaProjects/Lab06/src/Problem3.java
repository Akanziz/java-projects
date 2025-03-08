import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Problem3 {
    public static PriorityQueue<Integer> toMaxHeap(HashSet<Integer> hSet) {
        Comparator<Integer> maxHeapComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(maxHeapComparator);
        maxHeap.addAll(hSet);

        return maxHeap;
    }
}
