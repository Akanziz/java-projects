    public class Problem5 {
        public static int compareTo(String s1, String s2) {
            for (int i=0; i < Math.min(s1.length(), s2.length()); i++) {
                if (s1.charAt(i) < s2.charAt(i)) {
                    return -1;
                }
                else if (s1.charAt(i) > s2.charAt(i)) {
                    return 1;
                }
            }
            if (s1.length() < s2.length()) {
                return -1;
            } else if (s1.length() > s2.length()) {
                return 1;
            }
            return 0;
        }
    }

