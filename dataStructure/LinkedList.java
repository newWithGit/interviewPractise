package dataStructure;

public class LinkedList<T> {
  Node first;
  int length = 0;
  int header;
  public LinkedList() {

  }

  public boolean isEmpty() {
    return (first == null)
  }

  /*
  * Create a temp Node
  * iterate till temp in not null
  when temp is null add the Node
  increase length of LinkedList
  */
  public boolean add(T t) {
    Node node = new Node(T t);
    if (length != 0) {
      Node temp = new Node();
      temp = first;
      while(temp!=null) {
        temp = temp.next;
      }
      temp.next = node;
      temp = null;
    } else {
      addFirst(node);
    }
    length +=1;
    return true;
  }

  private void addFirst(Node node) {
    first = node;
  }

  
}

// Generic class
class Node<T> {

  private T data;
  private Node next;

  Node() {

  }
  // T value getting assigned, we will call it while add method
  Node(T t) {
    this.data = t;
  }

}
