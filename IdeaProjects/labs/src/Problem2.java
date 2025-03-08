public class Problem2 {


    public static double computeGpa(String grade) {
        char letter = grade.charAt(0);
        double numericValue;

        switch (letter) {
            case 'A':
                numericValue = (grade.length() > 1 && grade.charAt(1) == '+') ? 4.0 : 4.0;
                break;
            case 'B':
                numericValue = (grade.length() > 1 && grade.charAt(1) == '+') ? 3.3 : 3.0;
                break;
            case 'C':
                numericValue = (grade.length() > 1 && grade.charAt(1) == '+') ? 2.3 : 2.0;
                break;
            case 'D':
                numericValue = (grade.length() > 1 && grade.charAt(1) == '+') ? 1.3 : 1.0;
                break;
            case 'F':
                numericValue = 0.0;
                break;
            default:
                throw new IllegalArgumentException("Invalid letter grade: " + grade);
        }


            return numericValue;
        }

    }







