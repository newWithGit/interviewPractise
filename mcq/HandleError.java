package mcq;
/*
in this class we are handle StackoverFlowError
*/
public class HandleError {
  public static void main(String[] args) {
    HandleError.handleError(0);
  }
  private static void handleError(int n) {
    try {
      handleError(n+1);
    } catch (StackOverflowError t) {
      System.out.println("Caught StackoverFlow error - " + t);
    }
  }
}
