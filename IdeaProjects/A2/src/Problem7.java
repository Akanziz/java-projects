public class Problem7 {
    /**
     * find the number of pairs that satisfies (a^2 + b^2 + 1)/(a*b) and 1
     *
     * @param n integer that represents n in 1 <= a <= b <= n
     * @return int representing the number of pair the satisfy the equation
     */

    public static int countPairs(int n) {
        int pairs = 0;
        for (int a = 1; a < n; a++) {
            for (int b = a; b < n; b++) {
                int num = a * a + b * b + 1;
                int divisor = a * b;
                if (num % divisor == 0) {
                    pairs++;
                }
            }
        }


        return pairs;
    }
}
