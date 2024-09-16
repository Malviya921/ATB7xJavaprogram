package ex_20072024;

import java.util.Scanner;

public class lab0087 {
    public static void main(String[] args) {
        // take a user input and check if number id even or odd.

        // logic building - ready
        // 1. figure out the inputs
        // data type - int
        //how to take imput in the java? - scaner - class-
        // nextint() - > input

        // 3. Do we need cone=version or directly
        //4. rough logic - num%2== even or else odd
        //5. optimize

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER 1");
        int user_input = sc.nextInt();
        System.out.println(user_input);

        System.out.println("ENTER THE NUMBER 2"); // if we want to have two inputs
        int user_input2 = sc.nextInt();
        System.out.println(user_input);

        if (user_input%2==0) {
            System.out.println("even");
        }else {
            System.out.println("odd");
        }




    }
}
// btu this program is breaking if we enter a string or float (10.23) , or special ch.
// the error is inoput missmatch
// so the java ia a very strict language