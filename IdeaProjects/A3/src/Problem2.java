public class Problem2 {
    static int median(int[] A, int[] B) {
        int[] result = new int[A.length + B.length];
        int indA = 0;
        int indB = 0;

        int big_index = 0;
        while (indA < A.length && indB < B.length){
            if ((indA < A.length && indB < B.length) && A[indA] < B[indB]){
                result[big_index] = A[indA];
                ++indA;
            }
            else {
                result[big_index] = B[indB];
                ++indB;
            }
            ++big_index;
        }
        while (indA < A.length){
            result[big_index] = A[indA];
            ++big_index;
            ++indA;
        }
        while (indB < B.length){
            result[big_index] = B[indB];
            ++big_index;
            ++indB;
        }


        if (result.length % 2 == 0){
            double true_result = 0.0;
            true_result = (result[result.length/2] + result[(result.length/2) - 1])/2;
            return (int) Math.round(true_result);
        }else{
            return result[result.length/2];
        }
    }
}
