package testerClasses;

/*string class with no literal pool - noticed that string is most frequently used, memory usages
string class with literal pool - now only one copy - if str1 gets updated str2 also gets updated - which is wrong
string immutability - to solve problem 2 came immutability

public static int ourCompareTo(String obj1, String obj2) {
 if (obj1.equals(obj2)) return 0;
 if (obj1.length() != obj2.length()) return obj1.length() - obj2.length();
 for (int i = 0; i<obj1.length(); i++) {
  int dif = obj1.charAt(i) - obj2.charAt(i);
  if (dif != 0 ) return dif;
  }
  return 0;
}


*/



public class StringTest {
  public static void main(String[] args) {
    String demo = "My name is Geeta Kumari. My pet name is Geetu.";
    String str1 = "aa";
    String str2 = "aasdfdsfds";
    System.out.println("charAt : " + demo.charAt(15));
    System.out.println("char() : " + demo.chars()); // returns InputStream
    System.out.println("codePointAt : " + demo.codePointAt(15));// returns acsii values of charAt(index)
    System.out.println("codePointBefore : " + demo.codePointBefore(16));
    System.out.println("codePointCount : " + demo.codePointCount(0, demo.length()));
    System.out.println("compareTo : " + str1.compareTo(str2));
    //System.out.println("ourCompareTo : " + StringTest.ourCompareTo(str1, str2));
    //System.out.println("compareTo : " + str1.compareTo(str1));
    //System.out.println("compareTo : " + str2.compareTo;
  }


}
