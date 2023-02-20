/**
 * @author Delaware Technical Community College
 * Starter and/or reference code provided for Delaware Technical Community College courses.
 * deque ADT
 */
public interface Deque<E> {

    /**
     * Place an element at the rear of the deque.
     *
     * @param it The element being queued.
     * @throws IllegalStateException- if the element cannot be added at this time due to capacity restrictions
     */
    public void addBack(E it) throws IllegalStateException;;

    /**
     * Place an element at the front of the deque.
     *
     * @param it The element being queued.
     * @throws IllegalStateException- if the element cannot be added at this time due to capacity restrictions
     */
    public void addFront(E it) throws IllegalStateException;;

    /**
     * Remove and return element at the front of the deque.
     *
     * @return The element at the front of the deque.
     * @return null if the deque is empty
     */
    public E removeFront();

    /**
     * Remove and return element at the back of the deque.
     *
     * @return The element at the back of the deque.
     * @return null if the deque is empty
     */
    public E removeBack();

    /**
     * @return The front element.
     * @return null if the deque is empty
     */
    public E frontValue();

    /**
     * @return The back element.
     * @return null if the deque is empty
     */
    public E backValue();

    /**
     * Detects whether this deque is empty.
     *
     * @return True if the deque is empty.
     * @return False if the deque has one or more items in it.
     */

    public boolean isEmpty();

    /**
     * @return The number of elements in the deque.
     */
    public int length();
}
