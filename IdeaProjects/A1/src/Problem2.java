public class Problem2 {
    /**
     * this method calculates the total cost of apples, bananas, oranges, bunches of gi
     *
     * @param a This is the number of apples
     * @param b This is the number of bananas
     * @param o This is the number of oranges
     * @param g This is the number of bunches of grapes
     * @param p This is the number of pineapples
     * @return double total cost of the fruits purchased in US dollars
     */

    public static Double grocery(int a, int b, int o, int g, int p) {

        double apples = (a * 0.59);
        double bananas = (b * 0.99);
        double oranges = (o * 0.45);
        double grapes = (g * 1.39);
        double pineapple = (p * 2.24);


        return apples + bananas + oranges + grapes + pineapple;
    }
}
