public class CutChar {

    String Cutchar(String s, int i) {
        if (i < 0 || i >= s.length()) {
            return s;
        }


        String firsthalf = s.substring(0, i);
        String secondhalf = s.substring(i + 1);
        return firsthalf + secondhalf;
    }
}




