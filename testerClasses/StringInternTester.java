package testerClasses;

public class StringInternTester {
  public static void main(String[] args) {
    String s1 = new String("Java");
    //String s2 = "Java";
    //System.out.println(s1==s2);
    //String s3 = s1.intern();
    //System.out.println(s3.hashCode());

    //System.out.println(s1==s3);
    //System.out.println(s2==s3);

    //System.out.println(s5.hashCode());
    String s4 = s1.concat("Java");
    String s5 = s4.intern();
    //String s5 = "JavaJava";
    System.out.println(s4);
    System.out.println(s5);
    System.out.println(s4==s5);


    //System.out.println(s1 + " " + s4);
    //String s5 = "Java" + "interesting";
    //String s6 = "Javainteresting";
    //String s7 = "Javainteresting".concat("hello");
    //String s8 = "Javainterestinghello";
    //System.out.println(s4==s5);
    //System.out.println(s6==s5);
    //System.out.println(s7==s8);

    //System.out.println(s7 + " " + s8);
  }
}
