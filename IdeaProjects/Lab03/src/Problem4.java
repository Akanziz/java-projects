public class Problem4 {

    public static String replaceABTR(String s) {
        return replaceABTRHelp(s, "");
    }

    private static String replaceABTRHelp(String s, String result) {
        if (s.length() == 0) {
            return result;
        } else {
            if (s.charAt(0) == 'A') {
                return replaceABTRHelp(s.substring(1), result + 'B');
            } else {
                return replaceABTRHelp(s.substring(1), result + s.charAt(0));
            }


        }
    }
}
