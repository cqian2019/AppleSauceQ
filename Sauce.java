import java.util.ArrayList;

public class Sauce<Pigeon> implements Deque<Pigeon> {

    //instance variables
    private ArrayList<Pigeon> _container;
    private int size;


    //CONSTRUCTOR
    public Sauce(10) {
        _container = new ArrayList<Pigeon>(10);
        size = 0;


    }

    //Inserts the specified element at the front of this deque unless it
    //would violate capacity restrictions.
    public boolean offerFirst(Pigeon e) {
      if( size == _container.length){
        return false;
      }
      ArrayList<Pigeon> temp = new ArrayList(_container.length);
      temp[0] = e;
      for(int i = 1; i < size + 1; i++){
        temp[i] = _container[i - 1];
      }
      _container = temp;
      return true;

    }
    //Inserts the specified element at the end of this deque unless it
    //would violate capacity restrictions.
    public boolean offerLast(Pigeon e) {
      if( size == _container.length){
        return false;
      }
      _container[size] = e;

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
      return true;

    }

    //Returns the number of elements in this deque.
    public int size() {
      return size;
    }

}
