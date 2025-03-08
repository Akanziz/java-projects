import java.util.PriorityQueue;

public class Problem4 {
    public static String pqToString(PriorityQueue<String> P) {
        StringBuilder em = new StringBuilder();
        em.append("{");

        boolean bread = true;
        for (String s : P) {
            if (!bread) {
                em.append(",");
            }
            em.append("{").append(s).append("}");
            bread = false;
        }

        em.append("}");
        return em.toString();
    }
}
