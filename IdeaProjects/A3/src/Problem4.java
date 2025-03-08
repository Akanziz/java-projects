import java.util.LinkedHashSet;

public class Problem4 {
    /**
     * This method looks through an array to find the peaks.
     * @param peaks is an integer array of peaks.
     * @return array of the peak
     */
    static int[] peakFinder(int[] peaks) {
        LinkedHashSet<Integer> resultHash = new LinkedHashSet<>();
        int[] result = new int[0];

        int index = 0;
        while (index < peaks.length){
            if ((index != 0) && (index != peaks.length - 1)){
                if ((peaks[index - 1] < peaks[index]) && (peaks[index + 1]) < peaks[index]){
                    resultHash.add(peaks[index]);
                }
            }
            ++index;
        }
        return resultHash.stream().mapToInt(Integer::intValue).toArray();
    }
}
