package Stringclasspractise;

public class FindLargeCharacter {
    public static void main(String[] args) {
       String s1="meera";
       char largestcharecter='a';

       for(int i=0;i<s1.length();i++){
           if(s1.charAt(i)>largestcharecter){
               largestcharecter=s1.charAt(i);
           }
       }
        System.out.println(largestcharecter);
       }
}