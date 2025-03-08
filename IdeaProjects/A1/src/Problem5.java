public class Problem5 {

    /**
     * This method receives an email address and returns the username
     * @param email This is in the form x@y.z
     * @return sString the username of the person in the form x
     */

    public static String cutUsername(String email){
        String username = email.substring(0, email.indexOf("@"));
        return username;
    }
}
