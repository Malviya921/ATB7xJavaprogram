package ex_14072024;

public class lab0079 {
    public static void main(String[] args) {
        // Ternary operator.
        // ? condition if true do this : else do that

        boolean result = 10>40 ? false : true;
        System.out.println(result);

        int a1 = 10>40 ? 89 : 91;
        System.out.println(a1);

        int a2 = (30>40) ? 10:20;
        System.out.println(a2);

       // int a3 = 10>20 ? "10" : "ELEVEN" ;  this is wrong why? bcoz it the data type is specified is wrong
        String a3 = 10>20 ? "10" : "ELEVEN" ;
        System.out.println(a3);





    }
}
