
public class MinimumSwap {
  public static void main(String[] args) {
    MinimumSwap.minimumSwap(null);
  }

  private static void minimumSwap(int[] a) {
    if (a.length == 0) {
      System.out.println(0);
      return;
    }
    int swap = 0;
    for (int i = 0; i<a.length;i++) {
      if (a[i] == i+1)
        continue;
      for(int j = i+1; j<a.length;j++) {
        if (i+1 == a[j]) {
          int temp = a[j];
          a[j] = a[i];
          a[i]=temp;
          swap +=1;
        }
      }
    }
    System.out.println(swap);
  }
}
