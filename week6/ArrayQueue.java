public class ArrayQueue<T> implements Queue<T> {
    private final int DEFAULT_CAPACITY = 7;
    private T[] queue;

    private int front, back, count;

    public ArrayQueue() {
        queue = (T[])(new Object[DEFAULT_CAPACITY]);
    }

    public ArrayQueue(int size) {
        queue = (T[])(new Object[size]);
    }

    @Override
    public void enqueue(T it) throws IllegalStateException {

    }

    @Override
    public T dequeue() {
        return null;
    }

    @Override
    public T frontValue() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public int length() {
        return count;
    }
}
