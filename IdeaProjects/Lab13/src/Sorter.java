import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Sorter {
        /**
         * Sorts the input list using merge sort algorithm.
         *
         * @param ls The list to be sorted.
         * @param <T> The type of elements in the list, which must implement Comparable interface.
         * @return The sorted list.
         */
        static <T extends Comparable<T>> List<T> mySort(List<T> ls) {
            if (ls.size() <= 1) {
                return ls;
            }

            int mid = ls.size() / 2;
            List<T> left = mySort(ls.subList(0, mid));
            List<T> right = mySort(ls.subList(mid, ls.size()));
            return merge(left, right);
        }

/**
 * Merges two sorted lists into a single sorted list.
 *
 * @param left The left sorted list.
 * @param right The right sorted list.
 * @param <T> The type of elements in the lists, which must implement Comparable interface.
 * @return The merged sorted list.
 */

private static <T extends Comparable<T>> List<T> merge(List<T> left, List<T> right) {
    List<T> result = new ArrayList<>();
    int leftIndex = 0, rightIndex = 0;
    while (leftIndex < left.size() && rightIndex < right.size()) {
        if (left.get(leftIndex).compareTo(right.get(rightIndex)) < 0) {
            result.add(left.get(leftIndex++));
        } else {
            result.add(right.get(rightIndex++));
        }
    }
    result.addAll(left.subList(leftIndex, left.size()));
    result.addAll(right.subList(rightIndex, right.size()));
    return result;
}

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();

        long startTimeMySort = System.currentTimeMillis();
        List<String> sortedListMySort = mySort(new ArrayList<>(words));
        long endTimeMySort = System.currentTimeMillis();
        long timeElapsedMySort = endTimeMySort - startTimeMySort;
        System.out.println("Time taken for mySort: " + timeElapsedMySort + " milliseconds");


        Collections.shuffle(words);

        long startTimeCollectionsSort = System.currentTimeMillis();
        Collections.sort(words);
        long endTimeCollectionsSort = System.currentTimeMillis();
        long timeElapsedCollectionsSort = endTimeCollectionsSort - startTimeCollectionsSort;
        System.out.println("Time taken for Collections.sort: " + timeElapsedCollectionsSort + " milliseconds");
    }
}




