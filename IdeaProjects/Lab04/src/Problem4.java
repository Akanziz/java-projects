public class Problem4 {
    /**
     * This checks is a number is self dividing.
     * @param n is the number we are checking.
     * @return boolean true or false.
     */

    public static boolean isSelfDividing(int n) {
        int orig = n;
        int total = 0;

        if (n == 0) return false;

        while (orig > 0) {
            int digit = orig % 10;
            total += digit;
            orig /= 10;
        }

        return n % total == 0;
    }
}

