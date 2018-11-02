package testerClasses;


public class ToStringTest {
  public static void main(String[] args) {
    Employee emp = new Employee();
    System.out.println(emp);
  }
}

class Employee {
  String name = "Geeta";
  String petName = "puchu";

  @Override
  public String toString() {
    return "name: " + name + ", petName: " + petName;
  }
}
