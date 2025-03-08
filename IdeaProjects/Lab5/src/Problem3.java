
public class Problem3 {
    static int[] countEvenOdds(int[] A){
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0){
                evenCount ++;
            }else {
                oddCount++;
            }
        }
       int[] result = new int[] {evenCount, oddCount};
        return result;
    }

}





