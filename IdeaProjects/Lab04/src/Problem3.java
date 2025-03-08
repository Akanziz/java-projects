public class Problem3 {
   public static String censor(String s, String c) {
      if (c.length() == 0) return s;
      String temp = "";
      for(int i = 0; i < s.length(); i++) {
         int equals = 0;
         for (int j = 0; j < c.length(); j++) {
            if (i + j > s.length() - 1) break;
            if (s.charAt(i + j) != c.charAt(j)) {
               break;
            }
            equals++;
         }
         if (equals == c.length()) {
            for (int j = 0; j < c.length(); j++) {
               temp += "*";
            }
            i+= c.length() - 1;
         } else {
            temp += s.charAt(i);
         }
      }
      return temp;

      }
   }
