public class Problem5 {
    /**
     * This method checks if each digit in a number divides it evenly.
     *
     * @param n is the number we are going to check
     * @return boolean true or false depending on whether the digit divides evenly
     */

    public static boolean allSelfDividing(int n) {
        // var for temp = n
        int orig = n;

        // Iterate through each digit of n
        while (n > 0) {
            //each % to get last digit
            int digit = n % 10;

            // check for if false, then return false
            if (digit == 0 || orig % digit != 0) {
                return false;
            }
            // Move to the next digit
            n /= 10;
        }

        return true;
    }

}

