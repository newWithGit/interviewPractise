package hackerrank;

public class CheckIfStringisInt {
  public static void main(String[] args) {
    CheckIfStringisInt c = new CheckIfStringisInt();
    System.out.println(c.checkStrInt1("-123"));
  }

 // If check
  private boolean checkStrInt1(String str) {
    boolean isInt = false;
    if ( null == str)
    return false;
    try {
      int i = Integer.parseInt(str);
      isInt= true;
    } catch(NumberFormatException e) {
      isInt= false;
    }
    return isInt;
  }
}
