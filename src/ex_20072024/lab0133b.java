package ex_20072024;

import java.util.Scanner;

public class lab0133b {
    public static void main(String[] args) {
        // same example but with the user input


        Scanner sc = new Scanner(System.in);
        System.out.println("enter your no. here");
        int n = sc.nextInt();

        for (int i = 1; i <= n ; i++) {
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
