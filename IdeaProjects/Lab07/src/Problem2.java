import java.util.List;
import java.util.stream.Collectors;

public class Problem2 {
    /**
     * Adds "y" at the end of each string in the list and removes strings containing "yy".
     * @param los List of strings
     * @return List of modified strings
     */
    static List<String> addYRemoveYY(List<String> los)  {
        return los.stream()
                .map(s -> s + "y")
                .filter(s -> !s.contains("yy"))
                .collect(Collectors.toList());
    }
}
