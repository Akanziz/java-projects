public class Problem1 {


    public static String userId(String f, String l, int y) {
        String lastNamePrefix = "";
        if (l.length() > 5) {
            lastNamePrefix = l.substring(0, 5);
        } else {
            lastNamePrefix = l;
        }

        String firstNamePrefix = f.substring(0, 1);

        int lastTwoDigits = y % 100;
        String birthYearSuffix = (lastTwoDigits < 10) ? "0" + lastTwoDigits : "" + lastTwoDigits;


        return lastNamePrefix + firstNamePrefix + birthYearSuffix;
    }
}




