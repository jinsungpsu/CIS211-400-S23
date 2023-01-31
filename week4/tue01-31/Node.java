public class Node<T> {
    T data;
    Node next;
}

class Main2 {
    public static void main(String[] args) {
        // create a linked list of 3 integers
        // assign each node a value 1, 2, 3
        // display the contents of the whole linked list
        Node<Integer> n1 = new Node<>();
        n1.data = 1;
        Node<Integer> n2 = new Node<>();
        n1.next = n2;

        Node<Integer> n3 = new Node<>();

        // try different ways of "iterating" through the node... try using a loop....
    }
}

