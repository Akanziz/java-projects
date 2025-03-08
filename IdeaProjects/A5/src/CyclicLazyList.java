import java.util.Arrays;

class CyclicLazyList<T> implements ILazyList<T> {
    private T[] values;
    private int current;
    CyclicLazyList(T... vals) {
        if (vals.length == 0) {
            throw new UnsupportedOperationException("not implemented yet");
        }
        this.values = Arrays.copyOf(vals, vals.length);
        this.current = 0;
    }

    @Override
    public T next() {
        try {
            T result = values[current];
            current = (current + 1) % values.length;
            return result;
        } catch (IllegalArgumentException e) {
            throw new UnsupportedOperationException("not implemented yet");
        }
    }
}
