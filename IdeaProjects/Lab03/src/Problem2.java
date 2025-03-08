public class Problem2 {
    public static int countSTR(String s){
        return countStrTRHelp(s, 0);

    }

    private static int countStrTRHelp(String s, int n){
        if(s.length() < 3){
            return n;
        }

        if (s.substring(0, 3).equals("str")){
            return countStrTRHelp(s.substring(3), n+1);
        }
        else{
            return countStrTRHelp(s.substring(1),n);
        }
    }
}
