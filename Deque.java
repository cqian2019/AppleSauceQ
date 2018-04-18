public interface Deque<T>{

  //Inserts the specified element into the queue represented by this deque 
  //(in other words, at the tail of this deque) if it is possible to do so 
  // immediately without violating capacity restrictions, returning true upon 
  // success and throwing an IllegalStateException if no space is currently 
  // available.
    public boolean add(E e);
  
    public void	addFirst(E e)
//Inserts the specified element at the front of this deque if it is possible to do so immediately without violating capacity restrictions, throwing an IllegalStateException if no space is currently available.
    
    public void	addLast(E e)
//Inserts the specified element at the end of this deque if it is possible to do so immediately without violating capacity restrictions, throwing an IllegalStateException if no space is currently available.
    
    public boolean	contains(Object o)
//Returns true if this deque contains the specified element.
    
    public Iterator<E>	descendingIterator()
//Returns an iterator over the elements in this deque in reverse sequential order.

    public E	element()
//Retrieves, but does not remove, the head of the queue represented by this deque (in other words, the first element of this deque).

    public E	getFirst()
//Retrieves, but does not remove, the first element of this deque.

    public E	getLast()
//Retrieves, but does not remove, the last element of this deque.

    public Iterator<E>	iterator()
//Returns an iterator over the elements in this deque in proper sequence.

    public boolean	offer(E e)
    //Inserts the specified element into the queue represented by this deque (in other words, at the tail of this deque) if it is possible to do so immediately without violating capacity restrictions, returning true upon success and false if no space is currently available.

    public    boolean	offerFirst(E e)
//Inserts the specified element at the front of this deque unless it would violate capacity restrictions.

    public boolean	offerLast(E e)
//Inserts the specified element at the end of this deque unless it would violate capacity restrictions.

    public E	peek()
//Retrieves, but does not remove, the head of the queue represented by this deque (in other words, the first element of this deque), or returns null if this deque is empty.

    public E	peekFirst()
//Retrieves, but does not remove, the first element of this deque, or returns null if this deque is empty.

    public E	peekLast()
//Retrieves, but does not remove, the last element of this deque, or returns null if this deque is empty.

    public E	poll()
//Retrieves and removes the head of the queue represented by this deque (in other words, the first element of this deque), or returns null if this deque is empty.

    public E	pollFirst()
//Retrieves and removes the first element of this deque, or returns null if this deque is empty.

    public E	pollLast()
//Retrieves and removes the last element of this deque, or returns null if this deque is empty.

    public E	pop()
//Pops an element from the stack represented by this deque.

    public void	push(E e)
//Pushes an element onto the stack represented by this deque (in other words, at the head of this deque) if it is possible to do so immediately without violating capacity restrictions, throwing an IllegalStateException if no space is currently available.

    public E	remove()
//Retrieves and removes the head of the queue represented by this deque (in other words, the first element of this deque).

    public boolean	remove(Object o)
//Removes the first occurrence of the specified element from this deque.

    public E	removeFirst()
//Retrieves and removes the first element of this deque.

    public boolean	removeFirstOccurrence(Object o)
//Removes the first occurrence of the specified element from this deque.

    public E	removeLast()
//Retrieves and removes the last element of this deque.

    public boolean	removeLastOccurrence(Object o)
//Removes the last occurrence of the specified element from this deque.

    public int	size()
//Returns the number of elements in this deque.

}
