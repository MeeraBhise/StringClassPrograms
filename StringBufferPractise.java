package Stringclasspractise.StringBufferMethodP;

public class StringBufferPractise {
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer("java");
        sb.append("programming");
        //System.out.println(sb);

        String s=new String("JAVA");
    String s1 =  s.concat("programming");
        System.out.println(s1);
    }
}

class StringPrac {
    public static void main(String[] args) {
       /* String str1 = "mehar";
        System.out.println(str1);
        String str2=str1;
        str1=str1.concat("meera");
        System.out.println(str2);*/

        String str1 = "Technology"; // Line 1
        String str2 = str1;
        str1 = str1.concat("Java");
        System.out.println(str1);
        System.out.println(str2);


    }
}