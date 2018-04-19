# AppleSauceQ
Hasif Ahmed, Wenting Li, Kerwin Chen

Ordered To-Do List: 
1. do isEmpty;
1.5 do size;
2. do offerFirst;
3. do offerLast;
4. do peekFirst;
5. do peekLast;
6. do pollLast;
7. do pollFirst

Summary: 
We plan to develop our interface according to our to do list.

The methods we think that are essential are... 

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


We plan on using double-linked nodes as our underlying class due to the fact that a deque focuses on both ends of a data set and double-linked nodes would be helpful due to the use of the head and the tail. 
