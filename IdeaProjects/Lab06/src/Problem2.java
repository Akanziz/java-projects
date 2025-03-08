import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Problem2 {
    public static ArrayList<TreeSet<String>> categorize(HashMap<String, Integer> map) {
        ArrayList<TreeSet<String>> result = new ArrayList<>();

        int maxLength = 0;
        for (int length : map.values()) {
            maxLength = Math.max(maxLength, length);
        }

        for (int i = 0; i <= maxLength; i++) {
            result.add(new TreeSet<>());
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int length = entry.getValue();
            result.get(length).add(key);
        }

        return result;
    }
}
