package hackerrank;

public class RecursionFibonacci {

  private static final String SPACE = " ";

  public static void main(String[] args) {
    RecursionFibonacci.nonRecursiveFun(10);
    System.out.println(RecursionFibonacci.recursiveFun(10));
  }

  private static int recursiveFun(int n) {
    if (n>=3) {return recursiveFun(n-1) + recursiveFun(n-2);}
    else return 1;
  }

  private static void nonRecursiveFun(int n) {

    int firstNum = 1;
    int secNum = 1;
    StringBuilder sb = new StringBuilder();
    sb.append(firstNum);
    sb.append(SPACE);
    sb.append(secNum);
    sb.append(SPACE);
    n--;
    while(n>0) {
      int temp = firstNum + secNum;
      firstNum = secNum;
      secNum = temp;
      sb.append(temp);
      sb.append(SPACE);
      n--;
    }
    System.out.println(sb.toString());
  }
}
