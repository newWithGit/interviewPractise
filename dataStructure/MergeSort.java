package dataStructure;
import java.util.Arrays;

public class MergeSort {
  public static void main(String[] args) {
    int[] a = {2,3,6,1,8,5,9};
    MergeSort.mergeSort(a);
  }

  private static void mergeSort(int[] arr) {
    int len = arr.length;
    int mid = (len+1)/2;
    if (len > 1) {
      mergeSort(Arrays.copyOfRange(arr, 0, mid));
      mergeSort(Arrays.copyOfRange(arr, mid, len));
    }
    merge(arr);
    //System.out.println(Arrays.toString(arr));
  }

  private static void merge(int[] arr) {
    int i=0, j=0,k=0;

    //while i < arr
    System.out.println(Arrays.toString(arr));
  }
}
