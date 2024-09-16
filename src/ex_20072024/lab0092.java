package ex_20072024;

import java.sql.SQLOutput;
import java.util.Scanner;

public class lab0092 {
    public static void main(String[] args) {
        //if else - condition (if , if else, else) - multiple condition

        //switch - better condition for 2+ condition
        // which day it is from 1 to 7 or mon. to sunday

        Scanner sc = new Scanner(System.in);
        System.out.println("enter they day from 1 to 7 will tell you what day it is");
        int day = sc.nextInt();

        switch (day){
            case 1:
                System.out.println("monday");
                break;
                case 2:
                System.out.println("tue");
                    break;
                case 3:
                System.out.println("wed");
                    break;
                case 4:
                System.out.println("thur");
                    break;
                case 5:
                System.out.println("friday");
                    break;
                case 6:
                System.out.println("sat");
                    break;
                case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("no idea");

        }
        System.out.println("outside the switch loop ");
// it is like equal to operator , we can also apply debugging points to check the program
// to know thwe flow
    }
}
