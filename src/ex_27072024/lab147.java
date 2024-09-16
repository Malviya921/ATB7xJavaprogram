package ex_27072024;

import java.util.Arrays;

public class lab147 {
    public static void main(String[] args) {
        // find the max in an array
        // find the max salary in the salary array

        int [] salaries = {5,7,4,7,10,15,5,11,13};
        // infosys - automation interview
        int max = 1; // better we set it as int max = salaries[0],rather than assigning our value
        for (int i = 0; i < salaries.length ; i++) {
            if (salaries[i] > max ){
                max = salaries[i];
            }

        }
        System.out.println(max);

//------------------------------------------------------------------------

        // or we can use the Array.sort to soth the salary and then find the biggest one
        Arrays.sort(salaries);
        System.out.println(salaries[salaries.length-1]);
// what is the time complaxity here -> answered quick sort ? read more about it


    }
}
