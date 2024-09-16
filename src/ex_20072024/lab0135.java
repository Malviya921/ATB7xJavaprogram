package ex_20072024;

public class lab0135 {
    public static void main(String[] args) {
//        Function -> is a block of code which we can reuse.
// 1.    Some of them are prebuild ex.-> Math.max()
// 2.    some of them are used defined/created.

        //Two component of the function
        // 1. define.
        // 2. call the function.

        greet(); // this  the calling part of a functoin after it is been defined as defined below

        for (int i = 0; i < 5 ; i++) {
            greet2();
        }




    }
    // here we have defined a function which is greet() , here void tells us-> it's a non-returning function
    static void greet(){
        System.out.println("hi, how are you?");
    }
    //We can not give two function same name
    static void greet2(){
        System.out.println("i am fine");
    }

}
