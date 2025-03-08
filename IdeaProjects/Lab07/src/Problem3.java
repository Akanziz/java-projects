import java.util.List;
import java.util.stream.Collectors;

public class Problem3 {
    /**
     * Removes all odd values from the list and squares the remaining values.
     * @param lon List of doubles
     */
    static List<Double> filterThenSquare(List<Double> lon) {
        return lon.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * num)
                .collect(Collectors.toList());
    }
}
