package Stringclasspractise.StringMethods;

public class StringEqualsMethod {
    public static void main(String[] args) {
            String s1="meera";
            String s2="MEERA";
            String s3="ranjeet";
            String s4="ranjeet";
            //Equaels  method
        System.out.println(s1.equals(s2));
        //Equals Ignorecase method
        System.out.println(s3.equalsIgnoreCase(s4));
        //CompareTo method
        System.out.println(s1.compareToIgnoreCase(s2));
        //Compare to method
        System.out.println(s2.compareTo(s1));
    }
}
