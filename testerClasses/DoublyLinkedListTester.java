package testerClasses;

import dataStructure.DoublyLinkedList;

public class DoublyLinkedListTester {
  public static void main(String[] args) {
    DoublyLinkedList<String> db = new DoublyLinkedList<>();
    db.sortedAddString("Geeta");
    db.sortedAddString("Sita");
    db.sortedAddString("Ram");
    db.sortedAddString("Sham");
    db.sortedAddString("Jadu");
    db.sortedAddString("Madhu");

    System.out.println(db.toString());
  }
}
