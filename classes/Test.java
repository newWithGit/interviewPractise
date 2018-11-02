package atom_java_project.classes;

public class Test {
  public static void main(String[] args) {
    Thread th = new Thread(() -> System.out.println("Inside Thread"));
    th.start();
  }
}
