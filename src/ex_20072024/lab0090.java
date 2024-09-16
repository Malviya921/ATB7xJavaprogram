package ex_20072024;

import java.util.Scanner;

public class lab0090 {
    public static void main(String[] args) {

        // grade calculator
        // wriet a program that calculate & displays the letter grade for a given numerical
        // based on the following grading scale;
        // A = 90-100
        // b = 80-89
        // c = 70-79
        // d = 60-69
        // f = 0-59

        //1. find the user inputs
        // score - data type? - int - 90
        // return -> grade - data type - char - A
        //  DAA - ask the for the confert=mation for the doubts
        //interviewer -> int , char
        //scanner class for taking the inputs

        // 2. basic logic
        // if score>= 90 & score <= 100 -> return A
        // if score>= 80 & score <= 89 -> return B
        // if score>= 70 & score <= 79 -> return C
        // if score>= 60 & score <= 69 -> return D
        // else  score>= 0 & score <= 59 -> return F

        //3. write the code

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the student score");
        int score = sc.nextInt();

        char grade = 'F';

        if (score >=90 && score <= 100 )
        {
            System.out.println("grade is A");
        } else if (score >=80 && score <=89) {
            System.out.println("Grade is B");
        } else if (score >=70 && score <=9) {
            System.out.println("Grade is C");
        } else if (score >=60 && score <=69) {
            System.out.println("Grade is D");
        } else if (score >=0 && score <=59) {
            System.out.println("your grade is F");
        }else {
            System.out.println("you are beyond the limitation of Grading");
        }
        sc.close(); // this for the closing of the scanner class
        }


    }
