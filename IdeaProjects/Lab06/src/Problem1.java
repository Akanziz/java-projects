import java.util.LinkedList;
import java.util.TreeSet;

public class Problem1 {
    public static TreeSet<Double> toTreeSet(LinkedList<Double> Is) {
        TreeSet<Double> treeSet = new TreeSet<>(Is);
        return treeSet;
    }
}
