package Stringclasspractise;
/*public class parent{
    @Override
    public int hashCode() {
      //  System.out.println("method one");
        return 1010;
    }
}

 class hashcode  extends parent{
    @Override
       public  int  hashCode() {
            //System.out.println("method one");
       return 1010;
        }
    public static void main(String args[])
    {
        hashcode s=new hashcode();
       // int i =s.hashCode();
      //  System.out.println(s.hashCode());
        hashcode s1=new hashcode();
        //System.out.println(s.hashCode());
        hashcode s2=new hashcode();
        //System.out.println(s.hashCode());
    }
}*/
public class parent
{
   /*@Override
    public  int hashCode(){
       System.out.println("hashcode");
       return 1010;
}*/
}
class child extends parent{
    /*@Override
    public  int hashCode(){
        System.out.println("hashcode");
        return 1010;
    }*/
    public static void main(String[] args) {
       child c=new child();
        System.out.println(c.hashCode());
        child c1=new child();
        System.out.println(c1.hashCode());
    }
}
