package Stringclasspractise.StringMethods;
// Squeezing Method removes the white spaces  from left ,right (White Space Removing)
public class SequeezingMethod {
static int ind;
    static void removal(String s)
    {
        for(ind = 0; ind < s.length(); ind++)
        {
            char ch = s.charAt(ind);
            if(ch != ' ')
                System.out.print(ch);
        }
    }

    public static void main (String args[])
    {
     //   SqueezeString.squeeze("   coding ninjas    ");
    }
}


