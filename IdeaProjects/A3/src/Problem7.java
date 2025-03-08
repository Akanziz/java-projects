import java.util.HashMap;
import java.util.LinkedHashSet;

public class Problem7 {
    /**
     * This method sorts a hashmap and returns a hashset
     * @param M is the hashmap to be sorted
     * @return a sorted set.
     */
    static LinkedHashSet<String> largeToSmall(HashMap<String, Integer> M) {

        LinkedHashSet newSet = new LinkedHashSet();
        while (M.size() > 0){
            int highest_i = 0;
            String highest = "";
            for (String current : M.keySet()){
                if (M.get(current) > highest_i){
                    highest_i = M.get(current);
                    highest = current;
                }
            }
            newSet.add(highest);
            M.remove(highest);
        }

        return newSet;
    }
}
