package testerClasses;

import java.util.Map;
import java.util.HashMap;
import java.util.IdentityHashMap;

/*
The Map interface provides three collection views, which allow a map's contents to be viewed as a
set of keys, - keySet()
collection of values, - values()
or set of key-value mappings. - entrySet()
*/

public class MapTester {
  public static void main(String[] args) {
    /*
    Map<String, Integer> mapA = new HashMap<>();
    System.out.println(mapA.get("A"));

    Map<String, String> map1 = new HashMap<>();
    Map<String, String> map2 = new IdentityHashMap<>();

    String s1 = new String("s1");
    String s2 = new String("s1");

    map1.put(s1, "obj1");
    map1.put(s2, "obj2");

    map2.put(s1, "obj1");
    map2.put(s2, "obj2");
    System.out.println(map1.size() + " " + map2.size());
*/
  // called hashmap constructor with size - this will fix the size of map
    Map<Integer, Integer> mapTest = new HashMap<>(10);
    for (int i = 0; i<10; i++) {
      mapTest.put(i, i+100);
    }
    System.out.println(mapTest.get(100));
    System.out.println(mapTest.getOrDefault(100, -1));
    //MapTester.iterateForWithKeyAndValue(mapTest);
    //MapTester.iterateUsingEntrySet(mapTest);
  }

  private static void iterateUsingEntrySet(final Map<Integer, Integer> map) {
    for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
      System.out.println("entryKeys: " + entry.getKey() + " entryValue: " + entry.getValue());
    }
  }

  private static void iterateForWithKeyAndValue(final Map<Integer, Integer> map) {
    for (Integer i : map.keySet()) {
      //System.out.println("key: " + i);
      System.out.println("key: " + i + " value: " + map.get(i));
    }
    // values may or maynot be unique - that's why its not value set
    /*for (Integer i : map.values()) {
      System.out.println("value: " + i);
    }*/

    // Integer is not iterabe so we will get error
    /*for (Integer i : 100) {
      System.out.println(i);
    }*/

  }
}
