public class Problem6 {

    /**
     * This method takes integers, rounds them up/down and computes the sum of rounded values of three integers
     *
     * @param x is one of the integers
     * @param y is one of the integers
     * @param z is one of the integers
     * @return int The sum of the rounded values of the integers.
     */
    public static int computeRoundSum(int x, int y, int z) {


        int xRound = (int) (Math.round(x / 10.0) * 10);
        int yRound = (int) (Math.round(y / 10.0) * 10);
        int zRound = (int) (Math.round(z / 10.0) * 10);

        return (xRound + yRound + zRound);
    }
}