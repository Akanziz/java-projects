public class Problem3 {
    /**
     * This method computes the surface area of a pyramid
     *
     * @param l the base length of the pyramid
     * @param w the base width of the pyramid
     * @param h the vertical height of the pyramid
     * @return double the surface area
     */

    public static double pyramidSurfaceArea(double l, double w, double h) {

        double numberOne = l * w;
        double numberTwo = l * (Math.sqrt((w / 2 * (w / 2)) + (h * h)));
        double numberThree = w * (Math.sqrt(((l / 2) * (l / 2)) + (h * h)));

        return numberOne + numberTwo + numberThree;
    }
}
