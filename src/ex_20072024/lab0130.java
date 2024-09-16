package ex_20072024;

import java.util.Scanner;

public class lab0130 {
    public static void main(String[] args) {
        // factorial program
        // factorial of 5-> n=5 -> 1*2*3*4*5 = 120
        // factorial of 3-> n=3 -> 1*2*3 = 6

        Scanner sc = new Scanner(System.in);
        System.out.println("give me a number and i will give you it's factorial");
        int n = sc.nextInt();

        int fact = 1;
        //
        for (int i = 1; i <= n ; i++) {
            fact = fact*i;

        }
        System.out.println(fact);

        sc.close();


    }
}
