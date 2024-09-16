package ex_20072024;

import java.util.Scanner;

public class lab0133 {
    public static void main(String[] args) {
        //fizzBuzz problem
        // write a program that print number from 1 to 100.
        //For multiplies of 3, print "FIZZ" instead of the number.
        //and for the multiples of 5, print "BUZZ".
        //for number which are multiple of both 3 and 5,
        // print "FIZZBUZZ".


        for (int i = 1; i <=100 ; i++) {
            if (i%3 == 0 && i%5 == 0){
                System.out.println("FIZZ_BUZZ");
            }
           else if (i%3 ==0){
                System.out.println("FIZZ");
            }
           else if (i%5 == 0){
                System.out.println("BUZZ");
            }else {
                System.out.println(i);
            }

        }

    }
}
