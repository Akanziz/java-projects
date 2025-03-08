public class Problem11 {
    /**
     * This method deterines whether the water is a liquid, solid, or gas at sea level.
     *
     * @param t This is the water temperature.
     * @param u This is the unit that the temperature is in.
     * @return String Statement saying whether the water is a liquid, solid, or gas at sea level.
     */
    public static String stateOfMatter(double t, char u) {
        if (u == 'C') {
            if (t <= 0) {
                return "Solid";
            } else if (t <= 100) {
                return "Liquid";
            } else {
                return "Gas";
            }
        } else {
            if (t <= 32) {
                return "Solid";
            } else if (t <= 212) {
                return "Liquid";
            } else {
                return "Gas";
            }
        }
    }
}



