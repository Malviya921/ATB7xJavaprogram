package ex_27072024;

import java.util.Arrays;

public class lab147b {
    public static void main(String[] args) {
        // find the min in an array
        // find the min salary in the salary array

        int [] salaries = {9,7,4,7,10,15,5,11,13};
        // infosys - automation interview
        int min = salaries[0];
        for (int i = 0; i < salaries.length ; i++) {
            if (salaries[i] < min ){
                min = salaries[i];
            }

        }
        System.out.println(min);

//------------------------------------------------------------------------

        // or we can use the Array.sort to soth the salary and then find the biggest one
        Arrays.sort(salaries);
        System.out.println(salaries[0]);
// what is the time complaxity here -> answered quick sort ? read more about it


    }
}
