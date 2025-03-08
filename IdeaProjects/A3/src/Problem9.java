import java.util.List;

public class Problem9 {
    public static <T> String stringifyList(List<T> l) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < l.size(); i++) {
            if (i > 0) {
                result.append(", ");
            }
            result.append(l.get(i).toString());
        }

        return result.toString();
    }
}
