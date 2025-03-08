import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Searcher {

    /**
     * Performs binary search on the sorted list to find the key.
     *
     * @param ls The sorted list to search.
     * @param k The key to search for.
     * @param <T> The type of elements in the list, which must implement Comparable interface.
     * @return The index of the key in the list, or -1 if not found.
     */
    static <T extends Comparable<T>> int myBinarySearch(List<T> ls, T k) {
        int left = 0;
        int right = ls.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = ls.get(mid).compareTo(k);
            if (cmp == 0) {
                return mid; // Found the key
            } else if (cmp < 0) {
                left = mid + 1; // Key is in the right half
            } else {
                right = mid - 1; // Key is in the left half
            }
        }
        return -1; // Key not found
    }

    public static void main(String[] args) {
        // Read the file into a list (not implemented in this example).
        List<String> words = new ArrayList<>();
        // Assume words list is populated with almost 500,000 words.

        // Sort the list using Collections.sort.
        Collections.sort(words);

        // Choose a key to search for.
        String key = "example";

        // 1. Call myBinarySearch.
        long startTimeMyBinarySearch = System.currentTimeMillis();
        int indexMyBinarySearch = myBinarySearch(words, key);
        long endTimeMyBinarySearch = System.currentTimeMillis();
        long timeElapsedMyBinarySearch = endTimeMyBinarySearch - startTimeMyBinarySearch;
        System.out.println("Time taken for myBinarySearch: " + timeElapsedMyBinarySearch + " milliseconds");

        // 2. Call Collections.binarySearch.
        long startTimeCollectionsBinarySearch = System.currentTimeMillis();
        int indexCollectionsBinarySearch = Collections.binarySearch(words, key);
        long endTimeCollectionsBinarySearch = System.currentTimeMillis();
        long timeElapsedCollectionsBinarySearch = endTimeCollectionsBinarySearch -
                startTimeCollectionsBinarySearch;
        System.out.println("Time taken for Collections.binarySearch: " + timeElapsedCollectionsBinarySearch + " milliseconds");

        // Compare the results
        if (indexMyBinarySearch != -1) {
            System.out.println("Key found at index " + indexMyBinarySearch + " using myBinarySearch.");
        } else {
            System.out.println("Key not found using myBinarySearch.");
        }

        if (indexCollectionsBinarySearch != -1) {
            System.out.println("Key found at index " + indexCollectionsBinarySearch + " using Collections.binarySearch.");
        } else {
            System.out.println("Key not found using Collections.binarySearch.");
        }
    }
}