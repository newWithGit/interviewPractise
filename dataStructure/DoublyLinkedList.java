
/*
Doubly linked list has two pointers, pervious and next
it has one data
helps to create binary tree
 */

// main method be present in the public class for jvm's visibility
 public class DoublyLinkedList<T> {
  private int size;
  private Node<T> first = new Node();
  //
  public int lenght() {
    return this.size;
  }

  // add method
  public void add(T t) {
    Node<T> node = new Node<T>(t);
    if (first != null) {
      Node<T> temp = first;
      // have to keep track of prevoius so checking temp.next != null instead of temp = null
      while (temp.next != null) {
        temp = temp.next;
      }
      node.prevoius = temp;
      temp.next = node;
    }
    else {
      first.next = node;
      node.prevoius = first;
    }
  }

  public void sortedAddString(String t) {
    Node<String> node = new Node<String>(t);
    if (first != null) {
      Node<String> temp = first;
      // have to keep track of prevoius so checking temp.next != null instead of temp = null
      //StringComparator comparator = new StringComparator();
      //Node present = temp.next;
      while (temp.next != null) {
        if (node.data.compareTo((String)temp.next.data) >=0) {
            temp = temp.next;
        } else {
          temp = temp.prevoius;
        }
      }
      node.prevoius = temp;
      temp.next = node;
    }
    else {
      first.next = node;
    }
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    if (first != null) {
      Node temp = first;
      while (temp != null) {
        sb.append(' ');
        sb.append(temp.data);
        sb.append(' ');
        temp = temp.next;
      }
    }
    return sb.toString();
  }
 }

// Generic class to have 2 pointers for prevoius and next
 class Node<T> {
   protected T data;
   protected Node next;
   protected Node prevoius;

   public Node(T t) {
     this.data = t;
   }
   public Node() {}

 }
