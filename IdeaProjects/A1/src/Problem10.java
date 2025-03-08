public class Problem10 {
    /**
     * This method determines the number of small candy bars that can fit in the box.
     *
     * @param s This is the number of small bars.
     * @param l This is the number of large bars.
     * @param w This is the max weight that can fit in the box.
     * @return int Number of small candy bars that can fit in the box.
     */
    public static int fitCandy(int s, int l, int w) {
        int Weight = l * 5;
        int currentWeight = Weight + s;

        if (currentWeight == w) {
            return s;
        } else if (currentWeight < w) {
            return -1;
        }
        while (l * 5 > w) {
            l--;
        }

        if (w - (l * 5) < s)
            return w - (l * 5);
        else
            return -1;
    }
}
