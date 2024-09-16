package ex_27072024;

public class lab145b {
    public static void main(String[] args) { // main class will always take string type of arguments
        // if we replace string with int then it will no longer be main function

      //------------------------------------------------

        // we can add one check ex.->
        // if (args.length > 0){
        //    System.out.println(args[0]);
        // or we can do
        if (args.length > 0 ){
            for (int i = 0; i < args.length ; i++) {
                System.out.println(args[i]);

            }

        }else {
            System.out.println("no argument is given"); // here have deleted the input so the result is else st.
        }

    }
}