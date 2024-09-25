package Stringclasspractise;

public class StringPractiseExamples {
        public static void main(String[] args)
        {
            String str = "1456";
            int num = 9878;

// Converting string to int using Integer.parseInt() method
            int n1 = Integer.parseInt(str);
// Converting string to int using Integer.valueOf() method
            int n2 = Integer.valueOf(str);

            System.out.println("Converting String into Integer:");
            System.out.println("Using Integer.parseInt() method: " +n1);
            System.out.println("Using the Integer.valueOf() method : " +n2);

            System.out.println();
// Converting integer to string using String.valueOf() method
            String s = String.valueOf(num);
            System.out.println("Converting Integer to String:");
            System.out.println("Using the String.valueOf() method : "+s);
        }
    }

