package ex_20072024;

import java.util.Scanner;

public class lab0105 {
    public static void main(String[] args) {
        // vowel program using if statement
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the letter");
        char ch = sc.next().charAt(0);

        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println("vowel");

        }else {
            System.out.println("consonent");
        }







    }
}
