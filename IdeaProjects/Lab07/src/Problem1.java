import java.util.List;
import java.util.stream.Collectors;

public class Problem1 {
    /**
     * Concatenates all the strings in the list seperated by a comma.
     * @param los List of strings
     * @return Concatenated string
     */
    static String conjoin(List<String> los) {
        return los.stream()
                .collect(Collectors.joining(","));
    }
}
