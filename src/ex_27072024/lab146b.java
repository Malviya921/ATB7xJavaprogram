package ex_27072024;

import java.util.Scanner;

public class lab146b {
    public static void main(String[] args) {
         // we are going to use the for loop

        Scanner sc = new Scanner(System.in);
        float [] marks = new float[5];
        for (int i = 0; i < marks.length ; i++) {
            System.out.println("enter the marks for sub "+ i+1);
            marks [i] = sc.nextFloat();

            }

        // optionally , you can print out the marks of the subject to verif inputs

//        for (int i = 0; i < marks.length; i++) {
//            System.out.println("marks of the sub. " + i + 1 + marks[i]);
//        }

        // we can use while loop also
        int j = 0;
        while (j< marks.length){
            System.out.println(marks[j]); // here the merks[j] will still work
            j++;                // coz j will get subtituted by int. velaue from 0 to 4
        }

            float avg = (marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/5;
            System.out.println("avg is ->"+ avg);

            sc.close();

        }


    }