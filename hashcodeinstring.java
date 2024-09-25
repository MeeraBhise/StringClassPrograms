package Stringclasspractise;
 /* public class hashcodeinstring {

        @Override
        public int hashCode() {
            //return super.hashCode();
            return 101010;
        }
    }
    class HashTest extends hashcodeinstring {
        //Not recommended
        @Override
        public int hashCode() {
            return 1111;
        }

        public static void main(String[] args) {
            hashcodeinstring  pp =  new hashcodeinstring ();
            System.out.println("Parent hash "+pp.hashCode());

            hashcodeinstring  pp1 =  new hashcodeinstring ();
            System.out.println("Parent hash pp1 "+pp1.hashCode());

            HashTest tt = new HashTest();
            System.out.println(tt.hashCode());

            HashTest tt1 = new HashTest();
            System.out.println(tt1.hashCode());

            HashTest tt2 = new HashTest();
            System.out.println(tt2.hashCode());
        }
    }*/
public class hashcodeinstring{
     public static void main(String[] args) {
         System.out.println("main method");
         hashcodeinstring st=new hashcodeinstring();
         System.out.println(st.hashCode());
         hashcodeinstring st1=new hashcodeinstring();
         System.out.println(st1.hashCode());
         hashcodeinstring st3=new hashcodeinstring();
         System.out.println(st3.hashCode());
     }
 }



