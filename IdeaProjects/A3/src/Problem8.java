import java.util.Arrays;
import java.util.List;

public class Problem8 {
    /**
     * This method when given a list of binary operators and numeric
     * operands represents as strings, returns the result of evaluating the postfix-notation expression
     * @param l is the list of integers and operands as strings.
     * @return double the result of calculating the integers using the operands.
     */
    static double postfixEvaluator(List<String> l) {
        double Total = 0;
        double end = 0;
        String[] numberArray = {};
        for (String item : l) {
            if (!isOp(item)) {
                numberArray = addItem(numberArray, item);
            } else {
                if (numberArray.length > 1) {
                    Total = Double.valueOf(numberArray[0]);
                    for (int i = 1; i < numberArray.length; i++) {
                        Total = figureIt(Total, item, numberArray[i]);
                    }
                    end += Total;
                } else if (numberArray.length == 1) {
                    end = figureIt(end, item, numberArray[0]);
                }
                numberArray = new String[]{};
            }
        }
        return end;
    }

    private static boolean isOp(String s) {
        if (s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*")) {
            return true;
        }
        return false;
    }

    private static double figureIt(double a, String op, String b) {
        if (op.equals("+")) {
            return a + Double.valueOf(b);
        }
        if (op.equals("-")) {
            return a - Double.valueOf(b);
        }
        if (op.equals("*")) {
            return a * Double.valueOf(b);
        }
        if (op.equals("/")) {
            return a / Double.valueOf(b);
        }
        return 0.0;
    }

    /**
     * Given an array and a new item, add the new item to the array
     *
     * @param array   - the array you want modified
     * @param newItem - the new item you want added
     * @return the array including the new item
     */
    public static String[] addItem(String[] array, String newItem) {
        String[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = newItem;
        return newArray;
    }
}
