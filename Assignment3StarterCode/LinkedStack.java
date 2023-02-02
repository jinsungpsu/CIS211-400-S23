/*
https://visualgo.net/en/list
 */
public class LinkedStack<T> implements Stack<T> {
    private Node head;

    @Override
    public void push(T item) throws IllegalStateException {
        if (head == null) {
            // stack is empty
            // linked list is empty
            // special case
            head = new Node(item, null);
        } else {
            // there's at least one item here
            /*
            Vertex vtx = new Vertex(v)
            vtx.next = head
            head = vtx
             */
        }
    }

    @Override
    public T pop() {
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
        return 0;
    }

    private class Node {
        T data;
        Node next;

        public Node(T data, Node next) {
            this.next = next;
            this.data = data;
        }
    }
}
