package ex_20072024;

import java.util.Scanner;

public class lab0101 {
    public static void main(String[] args) {
        // write a program for the user where they are asked to enter their
        // name, age and salary

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = sc.next();

        System.out.println("Enter Your Age");
        int age = sc.nextInt();

        System.out.println("enter your Salary");
        double salary = sc.nextDouble();

        System.out.println("your name is "+name);
        System.out.println("your age is "+age);
        System.out.println("your salary is "+salary);

        sc.close();






    }
}
