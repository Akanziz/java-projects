public class MiniStack<T> {
    private static final int INITIAL_CAPACITY = 10;
    private T[] elements;
    private int size;

    @SuppressWarnings("unchecked")
    public MiniStack() {
        elements = (T[]) new Object[INITIAL_CAPACITY];
        size = 0;
    }

    private void resize() {
        int newCapacity = elements.length * 2;
        T[] newArray = (T[]) new Object[newCapacity];
        System.arraycopy(elements, 0, newArray, 0, size);
        elements = newArray;
    }

    public void add(T t) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = t;
    }

    public T peek() {
        if (size == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements[size - 1];
    }

    public T pop() {
        if (size == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        T popped = elements[--size];
        elements[size] = null; // avoid memory leak
        return popped;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = size - 1; i >= 0; i--) {
            sb.append(elements[i]);
            if (i > 0) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}
