public class Problem1 {
    public static int gcdTR(int a, int b) {
        if (b == 0)
            return a;
        else {
            int l = a % b;
            return gcdTR(b, l);
        }
    }

    public static int gcdLoop(int a, int b) {
        while (b != 0) {
            int l = b;
            b = a % b;
            a = l;
        }
        return a;
    }
}



