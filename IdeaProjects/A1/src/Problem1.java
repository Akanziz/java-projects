public class Problem1 {

    /**
     * method converts distance in gigameters into light seconds
     * @param gm is the distance which we are going to convert
     * @return double the distance in light seconds
     */

    public static double gigameterTosecond(double gm){

        return gm * 1000000000 / 299792458;
    }
}
