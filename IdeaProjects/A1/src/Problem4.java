public class Problem4 {
    /**
     * This method takes a string and strips the first and last characters
     * @param s This is the string whose characters are going to be stripped
     * @return string a new string with the first and last characters stripped
     */

    public static String flStrip(String s){
        int length = s.length();
        String newString = s.substring(1, length-1);
        return newString;
    }
}
