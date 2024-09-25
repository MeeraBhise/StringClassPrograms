package Stringclasspractise;

    public class SimpleString {

        public static void main(String[] args) {

            String usingNew = new String("Java");     //Using new keyword  => Heap Memory
            System.out.println("Length of String is "+usingNew.length());
            String literals = "Test";                        //String literal     => Perm Gen
            System.out.println("Length of String is "+literals.length());

            final String finalTest = "Java";
            //finalTest = "Programming";

            String nonFinal = "Java";                                       //First Object created
            System.out.println("Before concatenation Output is "+nonFinal);
            nonFinal = nonFinal.concat(" Programming");                 //Second Object created
            nonFinal = nonFinal.concat(" Test");                        //Third Object created
            System.out.println("Output is "+nonFinal);


            //nonFinal = "Programming";

        }
    }
