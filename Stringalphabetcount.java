package Stringclasspractise;


public class Stringalphabetcount{
    public static void main(String[] args) {
        String s1 = "javabest";
        int count=0;
for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)=='e'){
                count++;
            }
        }
        System.out.println("count of a is:"+ count+"times");
    }
}
/*
public class Stringalphabetcount{
    public static void main(String args[])
    {
        String s1="meeraranjeetmehar";
        int count1=0;
        int count2=0;
        int count3=0;
        for(int i=0;i<s1.length();i++)
        {
            if (s1.charAt(i)=='m'){
                count1++;
            }
            else if(s1.charAt(i)=='r')
            {
                count2++;
            }
            else if(s1.charAt(i)=='e')
            {
                count3++;
            }
         */
/* else{
         //       System.out.println("invalid string");
            }*//*

        }
        System.out.println("count of m is:"+count1);
        System.out.println("count of r is:"+count2);
        System.out.println("count of e is:"+count3);
    }
}
*/










