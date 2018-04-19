public interface Deque<T>{

  //Inserts the specified element into the queue represented by this deque 
  //(in other words, at the tail of this deque) if it is possible to do so 
  // immediately without violating capacity restrictions, returning true upon 
  // success and throwing an IllegalStateException if no space is currently 
  // available.

  
    public boolean	offerFirst(E e)
//Inserts the specified element at the front of this deque unless it would violate capacity restrictions.

    public boolean	offerLast(E e)
//Inserts the specified element at the end of this deque unless it would violate capacity restrictions.

    public E	peekFirst()
//Retrieves, but does not remove, the first element of this deque, or returns null if this deque is empty.

    public E	peekLast()
//Retrieves, but does not remove, the last element of this deque, or returns null if this deque is empty.

    public E	pollFirst()
//Retrieves and removes the first element of this deque, or returns null if this deque is empty.

    public E	pollLast()
//Retrieves and removes the last element of this deque, or returns null if this deque is empty.

    public int	size()
//Returns the number of elements in this deque.

}
