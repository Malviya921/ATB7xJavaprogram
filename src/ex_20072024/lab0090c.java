package ex_20072024;

import java.util.Scanner;

public class lab0090c {
    public static void main(String[] args) {
        // we can also write the previous program like this
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the student score");
        int score = sc.nextInt();

        char grade = 'F';

        if (score >=90 && score <= 100 )
        {grade = 'A';
        } else if (score >=80 && score <=89) {
            grade = 'B';
        } else if (score >=70 && score <=9) {
            grade = 'C';
        } else if (score >=60 && score <=69) {
            grade = 'D';
        } else if ( score < 0 || score > 100) { // we need to put here || not &&
            // to make this condition work
            System.out.println("LOL! are you Mr. Putin");
            grade = 'O';
        }else { grade = 'F';
        }
        System.out.println("your grade is -> " + grade);

        sc.close(); // this for the closing of the scanner class
        // nothing will happen if we dont close the scanner class garbage collector wil do it for us
    }
}