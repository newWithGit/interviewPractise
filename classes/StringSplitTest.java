package classes;
import java.util.*;

public class StringSplitTest {
  public static void main(String[] args) {
    String uri = "csi=2132132&;abc=sfsdfsf&;main=sdfdsfafsdf";
    String[] arr = uri.split(";");

    long start2 = System.currentTimeMillis();
    String[] a = null;
    Map<String, String> hasMap = new HashMap<>();
    for (String s:arr) {
      a = s.split("=");
      hasMap.put(a[0], a[1]);
    }
    System.out.println(hasMap);
    long end2 = System.currentTimeMillis();
    System.out.println((end2 - start2));



    long start = System.currentTimeMillis();
    Arrays.stream(arr).forEach(System.out::println);
    //Arrays.stream(arr).ma
    long end = System.currentTimeMillis();
    System.out.println((end - start));


    //System.out.println(arr);
  }
}
