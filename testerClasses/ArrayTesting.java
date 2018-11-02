package testerClasses;

import java.util.Arrays;

public class ArrayTesting {
  public static void main(String[] args) {
    int[] arr = {1,2,3};
    System.out.println(arr.toString());

    /*
    String[] arr = {"ram", "sharm", "jadu", "madhu", "mohan"};
      for (int i = 0; i<100; i++) {
      long start = System.currentTimeMillis();

      String[] copy1 = Arrays.copyOfRange(arr, 0,4);
      copy1= null;
      long end =System.currentTimeMillis();
      if (i==99) {
        System.out.println((end-start));
      }
    }

    for (int i = 0; i<100; i++) {
    long start = System.currentTimeMillis();
    String[] copy1 = new String[5];
    System.arraycopy(arr, 0,copy1,0,4);
    copy1= null;
    long end =System.currentTimeMillis();
    if (i==99) {
      System.out.println((end-start));
    }
  }*/
  }
}
