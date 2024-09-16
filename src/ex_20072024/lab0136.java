package ex_20072024;

public class lab0136 {
    public static void main(String[] args) {
        //    Function -> is a block of code which we can reuse.
        //  1.  Some of them are prebuild ex. Math.max()
        //  2. some of them are used defined/created.

        // Two component of the function
        // 1. define
        // 2. call the function
        // as we have learnt about ddefining and calling

        // now type of
        // 1. without parameters/arguments and without Return type
        // 2. without parameters/arguments and with Return type
        // 3. with parameters/arguments and without Return type
        // 4. with parameters/arguments and with Return type
//--------  TYPE 1   --------------------------------------------
        function_type1();

        System.out.println("____________");
  //-----  TYPE 2    ------------------------------------------------------
        String name = function_type2();
        System.out.println(name);

        System.out.println("____________");
 //------  TYPE 3   -------------------------------------------------------
        function_type3("prince"); // as it is a string data type , we can not pass int,float etc...
        function_type3("amit");
//----   TYPE 4  -----------------------------------------------------------
        int sum_result = function_type4(4,5);
        System.out.println("O/P -> "+sum_result);

//------  TYPE 4   -----------------------------------------------------
      //  function_type4();
        //  this will give us the error
        //  required: int,int
        //  found:    no arguments
        //  reason: actual and formal argument lists differ in length
// this function is type_4 and needs parameter/argument in the form of integers

        function_type4(5,6);
        // we have given the argument(5,6) and called the function it ran and gave us the output
        // as defined in the function, it is a return type function thouth in this case we have not used the return value
        // like we did the above




    }

    // "1. without parameters and without Return type "
        static void function_type1(){
            System.out.println("1. without parameters and without Return type ");
        }

        //No argument so it is not taking any argument -> () is empty
        //No return type because of void

    //"2. without parameters and with Return type"
        static String function_type2(){
            System.out.println("2. without parameters and with Return type");
            return "pramod";
        }

     // 3. with parameters and without Return type"
    static void function_type3(String name){
        System.out.println("3. with parameters and without Return type");
        System.out.println("You have shared ->"+name);
    }

    // 4. with parameters and with Return type
    static int function_type4(int a,int b){
        System.out.println("4. with parameters and with Return type");
        System.out.println("your inputs are ->"+a+","+b);
        return a+b;
    }



}
