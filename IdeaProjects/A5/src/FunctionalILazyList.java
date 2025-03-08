import java.util.function.Function;


class FunctionalLazyList<T> implements ILazyList<T> {
    private Function<T, T> function;
    private T current;
    FunctionalLazyList(Function<T, T> f, T t) {
        try{
            this.function = f;
            this.current = t;
        } catch (IllegalArgumentException e) {
            throw new UnsupportedOperationException("not implemented yet");
        }
    }

    @Override
    public T next() {
        try {
            T answer = current;
            current = function.apply(current);
            return answer;
        } catch (IllegalArgumentException e) {
            throw new UnsupportedOperationException("not implemented yet");
        }
    }
}
