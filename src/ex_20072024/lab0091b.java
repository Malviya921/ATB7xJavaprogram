package ex_20072024;

public class lab0091b {
    public static void main(String[] args) {

        if (true){
            System.out.println("1");}
        if (false){
            System.out.println("2");}
        if (true){
            System.out.println("3");}
        //here as we can see we are using if st. again not else if so it will not
        // go into the loop rather will stop the program as it will meet with a false st.
        //  and will not execute further
        // it could be like
        //        if (false){
        //            System.out.println("1");}
        //        if (true){
        //            System.out.println("2");}
        //        if (true){
        //            System.out.println("3");}

        // here progrram will not give any output as the 1st st is a false one
    }

}