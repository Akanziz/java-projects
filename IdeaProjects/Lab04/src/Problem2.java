public class Problem2 {

    public static boolean containsMiddleABC(String s) {
        if(s.length() < 3){
            return false;

        }
        int middle = s.length() / 2;
        if(s.length() % 2 == 0) {
            middle--;
        }
        return s.charAt(middle -1) == 'A' && s.charAt(middle) == 'B' && s.charAt(middle + 1) == 'C';
    }
}
