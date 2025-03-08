import java.util.ArrayList;
import java.util.List;

class LazyListTake<T> {
    private final ILazyList<T> lazyList;
    private final int n;
    LazyListTake(ILazyList<T> ll, int n) {
        try {
            this.lazyList = ll;
            this.n = n;
        } catch (IllegalArgumentException e) {
            throw new UnsupportedOperationException("not implemented yet");
        }
    }

    /**
     * Create a list of length n of the specific sequence given
     * @return a list of numbers
     */
    List<T> getList() {
        try {
            List<T> result = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                result.add(lazyList.next());
            }
            return result;
        } catch (IllegalArgumentException e) {
            throw new UnsupportedOperationException("not implemented yet");
        }
    }
}
