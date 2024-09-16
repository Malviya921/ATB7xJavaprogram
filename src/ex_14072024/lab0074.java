package ex_14072024;

public class lab0074 {
    public static void main(String[] args) {
        String name = "Testing the String";
        String name1  = "Testing the String";
        System.out.println(name1==name); // == checks for the reference (are they reference to same)
        System.out.println(name.equals(name1));// equal checks for the content
        // here note that the SCP will only store the unique values so the number of string will be = 1 only

          String name2 = new String("Testing the String"); // HEAP AREA OA
          String name3 = new String("Testing the String"); // HEAP AREA OA
// here in heap area we have created 2 new strings so now the no. of string will be = 3

        System.out.println(name1==name2); //here the result will be false bcoz the variable created are in the different place
        System.out.println(name1.equals(name2));// but here we are just checking the values so the result will be true
        //== checks for reference
        //equal checks for values










    }
}
