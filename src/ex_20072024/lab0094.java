package ex_20072024;

import java.util.Scanner;

public class lab0094 {
    public static void main(String[] args) {
        // take a user input and tell if it is a vowel or not
        // a,e,i,o,u

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A CHAR, I'LL tell YOU if it is a vowel or not");
        char user_input = sc.next().charAt(0);

        switch (user_input) {
            case 'a':
                System.out.println("vowel");
            case 'e':
                System.out.println("vowel");
            case 'i':
                System.out.println("vowel");
            case 'o':
                System.out.println("vowel");
            case 'u':
                System.out.println("vowel");
            default:
                System.out.println("it is a consonent");

        }

// note : WITHOUT BREAK IT IS EXECUTING ALL THE STATEMENTS AT ONCE

    }
}
