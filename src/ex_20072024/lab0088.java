package ex_20072024;

import java.util.Scanner;

// import java.lang; is always added to your program you dont have to type it
//it includes lot of functionals like math,systemstring thread integer boolean etc...
// import java.Math is also optional  **but read and clerar further**

public class lab0088  {
    public static void main(String[] args) {
        // max no. in two inputs
        Scanner sc = new Scanner(System.in);  // sc same as the scanf in the language
        System.out.println("enter then= num 1");
        int num1 = sc.nextInt();

        System.out.println("enter the num 2");
        int num2 = sc.nextInt();

//        System.out.println(Math.max(num1,num2));
// or we can doo this using if condition as well
        if (num1>num2){
            System.out.println(num1);
        } else if (num2>num1) {
            System.out.println(num2);
        } else {
            System.out.println("equal");
        }



    }
}
