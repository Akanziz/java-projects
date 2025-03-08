public class Problem6 {
    /**
     * Find the total sum of the integers within a string
     * @param s string
     * @return total sum of integers in the string
     */

    public static int strSumNums (String s) {
        int sum = 0;
        int currentNum = 0;
        for (int i= 0; i < s.length(); i++) {
            char c = s. charAt(i);
            if (Character. isDigit(c)) {
                currentNum = currentNum * 10 + Character.getNumericValue(c);
            }
            else {
                sum += currentNum;
                currentNum = 0;
            }
        }
        sum += currentNum;
        return sum;
    }
}
