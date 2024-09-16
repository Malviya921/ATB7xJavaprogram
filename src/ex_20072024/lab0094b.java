package ex_20072024;

import java.util.Scanner;

public class lab0094b {
    public static void main(String[] args) {
        // take a user input and tell if it is a vowel or not
        // a,e,i,o,u

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A CHAR, I'LL tell YOU if it is a vowel or not");
        char user_input = sc.next().charAt(0); // get the string and take the charachet at zero place

        switch (user_input) {
            case 'a':
                System.out.println("vowel");
                break;
            case 'e':
                System.out.println("vowel");
                break;
            case 'i':
                System.out.println("vowel");
                break;
            case 'o':
                System.out.println("vowel");
                break;
            case 'u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("it is a consonent");

        }



    }
}
