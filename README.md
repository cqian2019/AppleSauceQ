# AppleSauceQ
The methods we think that are essential are... 

    public void	addFirst(E e)
//Inserts the specified element at the front of this deque if it is possible to do so immediately without violating capacity restrictions, throwing an IllegalStateException if no space is currently available.
    
    public void	addLast(E e)
//Inserts the specified element at the end of this deque if it is possible to do so immediately

    public E	getFirst()
//Retrieves, but does not remove, the first element of this deque.

    public E	getLast()
//Retrieves, but does not remove, the last element of this deque.

    public E	pollFirst()
//Retrieves and removes the first element of this deque, or returns null if this deque is empty.

    public E	pollLast()
//Retrieves and removes the last element of this deque, or returns null if this deque is empty.

We plan on making an ArrayList as our underlying class because of the ease of understanding as well as use.
