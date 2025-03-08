import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem4 {
    /**
     * This method takes a list of strings and an index i and shifts each element by i spots.
     *
     * @param ls is an Array list
     * @param i  is an integer
     * @return A list with positions shifted.
     */

    static ArrayList<String> shift(ArrayList<String> ls, int i) {
        if (ls == null || ls.size() < 2) {
            return ls;
        }
        int effectiveShift = i % ls.size();
        if (effectiveShift == 0) {
            return ls;
        }
        List<String> shiftedSubList = new ArrayList<>(ls);
        Collections.rotate(shiftedSubList, effectiveShift);
        ArrayList<String> shiftedList = new ArrayList<>(shiftedSubList);
        return shiftedList;
    }
}
