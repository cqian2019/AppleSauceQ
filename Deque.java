public interface Deque<T>
{
    //Inserts the specified element at the front of this deque unless it 
    //would violate capacity restrictions.
    public boolean	offerFirst(E e);

    //Inserts the specified element at the end of this deque unless it 
    //would violate capacity restrictions.
    public boolean	offerLast(E e);

    //Retrieves, but does not remove, the first element of this deque, 
    //or returns null if this deque is empty.
    public E peekFirst();

    //Retrieves, but does not remove, the last element of this deque, 
    //or returns null if this deque is empty.
    public E peekLast();

    //Retrieves and removes the first element of this deque, or 
    //returns null if this deque is empty.
    public E pollFirst();

    //Retrieves and removes the last element of this deque, or 
    //returns null if this deque is empty.
    public E pollLast();

    //Returns the number of elements in this deque.
    public int size();

}
