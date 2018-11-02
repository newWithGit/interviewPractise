package testerClasses;

public class GroupSwitchCase {
  public static void main(String[] args) {
    char a = 'A';
    switch (a) {
      case 'a':
      case 'A':
        System.out.println("right");
        break;
      default:
        System.out.println("wrong");
    }
  }
}
