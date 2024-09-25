package Stringclasspractise;

public class Stringaddredcheck {
    public static void main(String[] args) {
        String s1 = new String("java");//heap memory
        String s2 = new String("java2");//heap memory
        String s3 = "java"; //scp// string constant pool
        String s4 = "java2";//scp // string constant pool
        boolean t1 =(s1==s2);// it checks the memory address in memory
        System.out.println(t1);
        boolean t2=(s3==s4);// and give boolean values true or false .
        System.out.println(t2);
        System.out.println("t1 values is:"+s1.equals(s2));
        System.out.println("t2 values is:"+s3.equals(s4));
    }
}

