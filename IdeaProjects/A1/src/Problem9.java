public class Problem9 {
    /**
     * This method determines whether a given point is strictly inside the circle
     *
     * @param cx This is the x-value of the circle center
     * @param cy This is the y-value of the circle center
     * @param r  This is the radius of the circle
     * @param px This is the x-value of the point being examined
     * @param py This is the y-value of the point being examined
     * @return boolean true when the point is inside the circle or false when it is not
     */


    public static boolean isInsideCircle(double cx, double cy, double r, double px, double py) {
        double distance = Math.sqrt(Math.pow(px - cx, 2) + Math.pow(py - cy, 2));

        // determine whether it is true
        return distance < r;
    }
}
