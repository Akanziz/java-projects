class PQueue<T> {
    private Node<T> first;
    private Node<T> last;

    private static class Node<T> {
        T value;
        Node<T> next;

        public Node(T value, Node<T> next){
            this.value = value;
            this.next = next;
        }
    }

    private int size;

    public PQueue() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public PQueue(Node<T> first, Node<T> last, int size) {
        this.first = first;
        this.last = last;
        this.size = size;
    }

    static<T> PQueue<T> of(T...vals){
        Node<T> first = null;
        Node<T> last = null;
        int size = 0;
        for (T val : vals) {
            Node<T> temp = new Node<>(val, null);
            if (first == null) {
                first = temp;
                last = temp;
            } else {
                last.next = temp;
                last = temp;
            }
            size++;
        }
        return new PQueue<>(first, last, size);
    }

    public PQueue<T> enqueue(T t) {
        Node<T> node = new Node<T>(t, null);

        if(size == 0){
            PQueue<T> output = new PQueue<T>();

            output.first = node;
            output.last = node;
            output.size = 1;

            return output;
        }
        else{
            Node<T> temp = this.last;

            temp.next = node;
            PQueue<T> output = new PQueue<T>();

            output.first = first;
            output.last = node;
            output.size = this.size + 1;

            return output;
        }
    }

    public PQueue<T> dequeue(){
        if(size == 0 || size == 1){
            PQueue<T> output = new PQueue<T>();

            output.first = null;
            output.last = null;
            output.size = 0;

            return output;
        }
        else{
            PQueue<T> output = new PQueue<T>();

            output.first = first.next;
            output.last = last;
            output.size = size - 1;

            return output;
        }
    }

    public T peek() {
        if (this.first == null)
            return null;
        return this.first.value;
    }

    public int size () {
        return this.size;
    }

    @Override
    public boolean equals (Object x) {
        if (x instanceof PQueue) {
            PQueue<T> x2 = (PQueue<T>) x;
            if (size == 0 && x2.size == 0)
                return true;
            if (size != x2.size())
                return false;
            Node<T> temp1 = this.first;
            Node<T> temp2 = x2.first;

            while (true) {
                if(temp1.next == null && temp2.next == null)
                    return true;
                else if(temp1.next == null || temp2.next == null)
                    return false;

                if(!temp1.value.equals(temp2.value))
                    return false;

                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }
        else
            return false;
    }
}
