public class Problem7 {
    /**
     * This method determines whether or not one of them is less than twenty away from another.
     * @param x This is one of the integers
     * @param y This is one of the integers
     * @param z This is one of the integers
     * @return boolean true when one of them is less than 20 from teh other or false if it is not.
     */

    public static boolean lessThan20(int x, int y, int z) {
        int diff1 = Math.abs(x - y);
        int diff2 = Math.abs(x - z);
        int diff3 = Math.abs(y - z);

        if(diff1 < 20 || diff2 < 20 || diff3 < 20)
            return true;
        else
            return false;
    }
}
