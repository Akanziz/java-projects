public class Problem2 {
    public static long subfactorialLoop(long m) {
        long c = m;
        long a = 1;
        long b = 0;
        if (m == 0) {
            return a;
        } else if (m == 1) {
            return b;
        }

        while (c > 1) {
            long temp = b;
            b = (c - 1) * (b + a);
            a = temp;
            c--;
        }

        return b;
    }
}

