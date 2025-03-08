import java.util.List;

public class Problem10 {
    /**
     * This method determines whether two separate lists that store integer values are parallet or not
     * @param t one of the lists
     * @param u another list
     * @return boolean true or false depending on whether they are parallel or not.
     */
    static <T extends List<Integer>> boolean areParallelLists(T t, T u) {
        boolean allZeros = true;
        for (int j = 0; j < t.size(); j++) {
            if((t.get(j) == 0 && u.get(j) != 0) || t.get(j) != 0 && u.get(j) == 0){
                return false;}
            if (t.get(j) != 0 && u.get(j) != 0) {
                allZeros = false;
                break;}}
        if (allZeros) {
            return true;}
        int tempt = t.get(0);
        int tempu = u.get(0);
        boolean uBigger = tempt < tempu;
        int factor = 0;

        if (uBigger) {
            factor = tempu / tempt;
        } else {
            factor = tempt / tempu;
        }
        if (!uBigger) {
            for (int i = 0; i < t.size(); i++) {
                if (!(u.get(i) == 0)) {
                    if (!(t.get(i) / u.get(i) == factor)) {
                        return false;
                    }
                }
            }
        } else {
            for (int i = 0; i < t.size(); i++) {
                if (!(t.get(i) == 0)) {
                    if (!(u.get(i) / t.get(i) == factor)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
