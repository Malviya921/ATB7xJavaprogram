package ex_20072024;

import java.util.Scanner;

public class lab0098b {
    public static void main(String[] args) {
        // we can fix the program for finding the vowel which we wrote earlier

        // like
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A CHAR, I'LL tell YOU if it is a vowel or not");
        char user_input = sc.next().charAt(0); // get the string and take the charachet at zero place

        switch (user_input){
            case 'a','e','i','o','u' -> System.out.println("vowel");
            default -> System.out.println("nahi pata");

        }




    }
}
