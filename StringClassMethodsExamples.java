package Stringclasspractise;

public class StringClassMethodsExamples {
    public static void main(String[] args) {
    String s="java is the mostly used language";
        System.out.println(s.intern());
        System.out.println(s.length());
        System.out.println(s.trim());
        System.out.println(s.chars());
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
      //  System.out.println(s);
        String [] s1=s.split(" ");
        for(String a:s1)
        {
            System.out.println(a);
        }
        System.out.println(s.concat(s));

}
}
