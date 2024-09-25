package Stringclasspractise.StringMethods;

public class StringLengthMethod {
    public static void main(String[] args) {
         String name=null;
         int i=name.length();
         if(i==0){
             System.out.println("name is not valid");
         }
         else{
             System.out.println("name is valid");
         }
        System.out.println(name.length());
    }
}
