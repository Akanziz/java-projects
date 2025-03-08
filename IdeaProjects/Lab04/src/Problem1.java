import static com.sun.org.apache.xalan.internal.lib.ExsltMath.power;

public class Problem1 {
    public static long hyperfactorialLoop(long n) {
        long hyper = 1;

        if (n <= 1)
            return 1;
        while (n > 1) {
            hyper *= (int) Math.pow(n, n);
            n--;
        }
        return hyper;
    }

}
