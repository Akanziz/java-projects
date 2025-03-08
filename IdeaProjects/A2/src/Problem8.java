public class Problem8 {
    /**
     * finds the left/right-Riemann approximation of the area of a circle
     * @param r double representing radius of circle
     * @paran delta double representing the delta
     * @return double representing the area of the circle.
     */
    public static double circleArea (double r, double delta) {
        double area = 0;
        for (double x = 0; x < r; x += delta) {
            double height = Math.sqrt(r * r - x * x);
            double rectangleArea = height * delta;
            area += rectangleArea;
        }
        return area * 4;
    }
}
