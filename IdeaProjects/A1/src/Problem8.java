public class Problem8 {
    public static boolean not( boolean p) {
        return !p;
    }
    public static boolean and(boolean p, boolean q) {
        return p && q;
    }
    public static boolean or(boolean p, boolean q) {
        return p || q;
    }
    public static boolean cond(boolean p, boolean q) {
        // p implies q is equivalent to notP or Q
        return !p || q;
    }
    public static boolean bicond(boolean p, boolean q) {
        // The same goes here but for double implies (<-->) is equavalent to P and q OR !p and q
        return p && q || !p && q;
    }
}
