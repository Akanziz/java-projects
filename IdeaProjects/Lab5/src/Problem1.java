class Problem1 {

    /**
     * computes the accumulated sum of elements in an array.
     *
     * @param A The input array of integers.
     * @return An array of integers representing the accumulated sum between each integer.
     */
    static int[] accSum(int[] A) {
        if (A.length == 0) {
            return new int[0];
        }
        int[] result = new int[A.length];
        result[0] = A[0];

        for (int i= 1; i < A.length; i++) {
            result[i] = result[i - 1] + A[i];
        }
        return result;
    }
}




