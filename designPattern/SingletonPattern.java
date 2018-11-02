package designPattern;

// Here class will have only one instance in JVM
public class SingletonPattern {
  private static volatile SingletonPattern singletonObj;

  // Priavte constructor so that object creation cannot be done
  private SingletonPattern() {}

  // have to be synchronized so that multiple thread don't end up creating multiple objects
  public static synchronized SingletonPattern getInstance() {
    if (singletonObj == null) {
      singletonObj = new SingletonPattern();
      System.out.println("Singleton obj got created");
    }
    return singletonObj;
  }

}
