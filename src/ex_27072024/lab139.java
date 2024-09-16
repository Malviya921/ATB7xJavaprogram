package ex_27072024;

import java.util.Scanner;

public class lab139 {
    public static void main(String[] args) {

        //Arrays -> new
        int[] marks = new int[3];
        //index -> 0,1,2
        // len -> 3
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        marks[0] = 91;
        marks[1] = 92;
        Scanner sc = new Scanner(System.in);
        System.out.println("type the number");
        // this way we can use scanner class to take user inputs

        marks[2] = sc.nextInt();

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
      //System.out.println(marks[10]); // WILL GIVE ArrayIndexOutOfBoundsException
// NOTE -> if we print index[10] at the start then program will not run further
        //coz we are getting the error at the start and the program will not run further

        boolean [] is_marrierd = {true,false,true};
        System.out.println(is_marrierd[0]);

        // To Print

        for (int i = 0; i < marks.length ; i++) {
          // i = 0,1,2
            System.out.println(i + " -> "+ marks[i]);
        }
//-------------------------------------------------------------
        String weekday[] = {"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
        for (int i = 0; i < weekday.length ; i++) {
            // here we can not use i<=,coz as we know the length = 7,but the i(index)=0 to 6 and
            // can not go till 7 coz 7 not exist.

            // and if we go from 0 to + then the error will occur at last
            // what if we start + to 0 then where will be the error
            // will the program fun further.
            System.out.println("today is "+ weekday[i]);

        }
        }



    }
