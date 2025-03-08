import java.util.Arrays;

public class Problem3 {

    public static String sortThreeStrings(String a, String b, String c){
        String[] arr = {a,b,c};
        Arrays.sort(arr);
        return(arr[0]+","+arr[1]+","+arr[2]);
}
}





