package classes;

import java.util.*;
import static java.util.Comparator.comparing;

public class PersonSorting {
  public static void main(String[] args) {
    System.out.println("ok");
    List<Person> person = PersonSorting.createPersons();
      //printSorted(person, comparing(Person::getName));
      PersonSorting.printSorted(person, comparing(Person::getAge));
      PersonSorting.printSorted(person, comparing(Person::getAge)
          .thenComparing(Person::getName));
  }

  private static List<Person> createPersons() {
    return Arrays.asList(
      new Person("Saurav", "MALE", 2),
      new Person("Geeta", "MALE", 30),
      new Person("Saurav", "MALE", 20),
      new Person("Geeta", "MALE", 2),
      new Person("Radhika", "MALE", 20),
      new Person("Ruma", "MALE", 20),
      new Person("Amit", "MALE", 20),
      new Person("Arijit", "MALE", 20)
    );
  }

  public static void printSorted(List<Person> person, Comparator<Person> comparator) {
    person.stream()
          .sorted(comparator)
          .forEach(System.out::println);
  }
}
