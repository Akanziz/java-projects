public class Problem1 {

        /**
         * Returns an array of strings following the FizzBuzz rules.
         * @param min the minimum value of the range
         * @param max the maximum value of the range
         * @return an array containing strings according to the FizzBuzz rules
         */
        static String[] fizzBuzz(int min, int max) {
            int length = max - min + 1;
            String[] result = new String[length];

            for (int i = 0; i < length; i++) {
                int num = min + i;
                if (num % 3 == 0 && num % 5 == 0) {
                    result[i] = "FizzBuzz";
                } else if (num % 3 == 0) {
                    result[i] = "Fizz";
                } else if (num % 5 == 0) {
                    result[i] = "Buzz";
                } else {
                    result[i] = String.valueOf(num);
                }
            }
            return result;
        }
}
