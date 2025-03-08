import java.util.ArrayList;

class Problem2 {
    /**
     * Computes the average of numbers in the list, excluding 9 and the number immediately following it.
     *
     * @param lon The list of integers.
     * @return The average of numbers in the list with the specified conditions.
     */

    static double sumNasty(ArrayList<Integer> lon) {
        if (lon == null || lon.isEmpty())
            return 0.0;

        double sum = 0;
        int count = 0;
        boolean skipNext = false;

        for (int i = 0; i < lon.size(); i++) {
            int num = lon.get(i);
            if (num == 9) {
                skipNext = true;
            } else {
                if (!skipNext) {
                    sum += num;
                    count++;
                }
                skipNext = false;
            }
        }
        return count == 0 ? 0.0 : sum / count;
    }
}





