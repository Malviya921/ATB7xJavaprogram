package ex_20072024;

import java.util.Scanner;

public class lab0104 {
    public static void main(String[] args) {
        // program to find out the max no. of the three no.

        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.");
        int num1 = sc.nextInt();

        System.out.println("enter no.");
        int num2 = sc.nextInt();

        System.out.println("enter no.");
        int num3 = sc.nextInt();

        if (num1>num2 && num1>num3){
            System.out.println(num1);
        }        if (num2>num1 && num2>num3){
            System.out.println(num2);
        }else {
            System.out.println(num3);
        }

// simple logic is
        // num1 > num2 and num1>nub3 = num1
        // num2 > num2 and num2>nub3 = num2
        // else num3


    }
}
