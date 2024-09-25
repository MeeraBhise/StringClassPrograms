package Stringclasspractise.StringMethods;

public class Stringexample {
    public static void main(String[] args) {

        String s1 = "java";
        StringBuffer sb = new StringBuffer("java");
        System.out.println(s1.equals(sb));

     //   boolean t1 = (s1 == sb);// it checks the memory address in memory
     //   System.out.println(t1);
    }
}