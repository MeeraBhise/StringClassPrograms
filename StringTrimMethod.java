package Stringclasspractise.StringMethods;

public class StringTrimMethod {
    public static void main(String[] args) {
        String s="  ranjeet meera mehar  ";
        if(s.length()==0)
        {
            System.out.println("name is not proper");
        }else{
            System.out.println("name is proper");
        }
        System.out.println(s.trim().length());
        System.out.println("string is:"+s);
    }
}
