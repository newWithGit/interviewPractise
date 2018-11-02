package designPattern;

public class SingletonTester {
  public static void main(String[] args) {
    System.out.print("ok");
    SingletonPattern obj1 = SingletonPattern.getInstance();
    SingletonPattern obj2 = SingletonPattern.getInstance();

    System.out.println(obj1.hashCode());
    System.out.println(obj2.hashCode());
    if (obj1 == obj2)
      System.out.println("We are good");
  }
}
