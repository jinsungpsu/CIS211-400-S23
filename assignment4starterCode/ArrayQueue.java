public class ArrayQueue<T> implements Queue<T> {
    private final int DEFAULT_CAPACITY = 7;
    private T[] queue;

    private int front, back, count;
    // front of the queue is left
    // back of the queue is right

    public ArrayQueue() {
        queue = (T[])(new Object[DEFAULT_CAPACITY]);
    }

    public ArrayQueue(int size) {
        queue = (T[])(new Object[size]);
    }

    /*
    What is the big o runtime efficiency/complexity of enqueue
    in a circular array queue?
     */
    @Override
    public void enqueue(T it) throws IllegalStateException {
        if (count < queue.length) {
            queue[back % queue.length] = it;
            count++;
            back++;
        }
    }

    @Override
    public T dequeue() {
        // return the item
        // update the front
        // update the count

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

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();

        /*
        This is wrong - it'll show things out of order
        when items have gone around the circular array
        
        for (int i = 0; i < count; i++) {
            output.append(queue[i] + " ");
        }
        */

        return output.toString();
    }
}
