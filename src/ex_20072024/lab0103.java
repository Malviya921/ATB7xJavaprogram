package ex_20072024;

import java.util.Scanner;

public class lab0103 {
    public static void main(String[] args) {
        // PROGRAM TO CHECK IF A NUMBER IS
        // POSITIVE, NEGATIVE OR ZERO

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no.");
        int num = sc.nextInt();

        if (num>0){
            System.out.println("positive number");
        } else if (num<0) {
            System.out.println("number is negative");
        }else {
            System.out.println("zero");

        }


    }
}
