package Stringclasspractise.StringMethods;

public class StringExample12 {
    public static void main(String[] args) {
        String fName = "Meera";
        String lName = "Bhise";
        System.out.println("First name is "+ fName);
        System.out.println("Last name is "+ lName);
       fName= fName+ lName;
       lName = fName.substring(0,fName.length()-lName.length());
        fName = fName.substring(lName.length());
    }
}
