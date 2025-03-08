

import java.io.IOException;

class FibonacciLazyList implements ILazyList<Integer> {

    private int n;
    private int fib1;
    private int fib2;
    FibonacciLazyList() {
        try {
            this.n = 0;
            this.fib1 = 0;
            this.fib2 = 1;
        } catch (IllegalArgumentException e) {
            throw new UnsupportedOperationException("not implemented yet");
        }
    }

    @Override
    public Integer next() {
        try {
            int current = fib1;
            int next = fib1 + fib2;
            fib1 = fib2;
            fib2 = next;
            n++;
            return current;
        } catch (IllegalArgumentException e) {
            throw new UnsupportedOperationException("not implemented yet");
        }
    }
}
