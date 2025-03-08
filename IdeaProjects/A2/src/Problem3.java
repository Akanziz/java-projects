public class Problem3 {
    /**
     * Returns the collatz sequence of the given number
     *
     * @param n integer
     * @return string of collatz sequence
     */

    public static String collatz(int n) {
        if (n == 1) {
            return "1";
        } else {
            if (n % 2 == 0) {
                return n + "," + collatz(n / 2);
            } else {
                return n + "," + collatz(3 * n + 1);
            }
        }
    }


    /**
     * Returns the collatz sequence of the given number
     * @param n integer
     * @return string of collatz sequence
     */
    public static String collatzTR(int n){return collatzHelper(n, "");}
    private static String collatzHelper(int n, String str) {
        if (n == 1) {
            return str + "1";
        } else {
            if (n % 2 == 0) {
                return collatzHelper(n / 2, str + n + ",");
            } else {
                return collatzHelper(1 + 3 * n, str + n + ",");
            }
        }
    }

    /**
     * Returns the collatz sequence of the given number
     * @param n integer
     * @return string of collatz sequence
     */
    public static String collatzLoop (int n) {
        StringBuilder result = new StringBuilder();
        while (n != 1) {
            result.append(n).append(",");
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }
        result.append("1");
        return result.toString();
    }
}

