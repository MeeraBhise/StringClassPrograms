package Stringclasspractise;

public class StringExample11 {
    public static void main(String[] args) {
     String s1="meera";
     String s2="bhise";
     s1=s1+s2;
     s2=s1.substring(0,s1.length()-s2.length());
     s1=s1.substring(s2.length());
        System.out.println("first name:"+s1);
        System.out.println("last name:"+s2);
    }
}
