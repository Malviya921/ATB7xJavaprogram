package ex_27072024;

import java.util.Scanner;

public class lab146 {
    public static void main(String[] args) {
        // note -> ALL THE FUNCTION ARE ALWAYS AVAILABLE IN THE STACKS

        // we will take the user input of the 5 subjects -> avg. of the subject
        // figure out input data type -> int or float

        Scanner sc = new Scanner(System.in);
        float [] marks = new float[5];
        System.out.println("enter the marks of sub. 1");
        marks[0] = sc.nextFloat();
        System.out.println("enter the marks of sub. 2");
        marks[1] = sc.nextFloat();
        System.out.println("enter the marks of sub. 3");
        marks[2] = sc.nextFloat();
        System.out.println("enter the marks of sub. 4");
        marks[3] = sc.nextFloat();
        System.out.println("enter the marks of sub. 5");
        marks[4] = sc.nextFloat();

        float avg = (marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/5;
        System.out.println("avg is ->"+ avg);



    }
}
