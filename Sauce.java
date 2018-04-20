import java.util.ArrayList;

public class Sauce<Pigeon> implements Deque<Pigeon> {

    //instance variables
    protected ArrayList<Pigeon> _container;
    protected int size;


    //CONSTRUCTOR
    public Sauce(int x) {
        _container = new ArrayList<Pigeon>(x);
        size = 0;


    }

    //Inserts the specified element at the front of this deque unless it
    //would violate capacity restrictions.
    public boolean offerFirst(Pigeon e) {
      if( size == _container.length){
        return false;
      }
      _container.add(0,e);
        size += 1;
      return true;

    }
    //Inserts the specified element at the end of this deque unless it
    //would violate capacity restrictions.
    public boolean offerLast(Pigeon e) {
      if( size == _container.length){
        return false;
      }
      _container[size] = e;
        size += 1;
      return true;


    }

    //Retrieves, but does not remove, the first element of this deque,
    //or returns null if this deque is empty.
    public Pigeon peekFirst() {
      if( size == 0){
      return null;
      }
      return _container[0];

    }

    //Retrieves, but does not remove, the last element of this deque,
    //or returns null if this deque is empty.
    public Pigeon peekLast() {
      if( size == 0){
      return null;
      }
      return _container[size - 1];

    }

    //Retrieves and removes the first element of this deque, or
    //returns null if this deque is empty.
    public Pigeon pollFirst() {
      if( size == 0){
      return null;
      }
      Pigeon ret = _container[0];
      _container.remove(0);
        size -= 1;
      return ret;


    }

    //Retrieves and removes the last element of this deque, or
    //returns null if this deque is empty.
    public Pigeon pollLast() {
      if( size == 0){
        return null;
      }
      Pigeon ret = _container[size];
      _container.remove(size);
        size -= 1;
      return true;

    }

    //Returns the number of elements in this deque.
    public int size() {
      return size;
    }

}
