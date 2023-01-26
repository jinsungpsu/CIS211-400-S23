public class ArrayStack<T> implements Stack<T> {
    private final int DEFAULT_CAPACITY = 10;
    private T[] stack;
    private int count = 0;

    public ArrayStack() {
        stack = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public ArrayStack(int size) {
        stack = (T[]) new Object[size];
    }

    @Override
    public void push(T item) throws IllegalStateException {
        if (count > stack.length-1) {
            // array is full
            throw new IllegalStateException();
        } else {
            // do some stuff

            stack[] = item;

            count++;
        }
    }

    @Override
    public T pop() {
        // make sure you're referring to the correct index of the stack array
        // make sure you update the count accordingly
        // return the data
        return null;
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int length() {
        return count;
    }

    @Override
    public String toString() {
        return "";
    }
}
