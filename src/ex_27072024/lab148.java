package ex_27072024;

public class lab148 {
    public static void main(String[] args) {
        // single dimensional array
        //have only one dimension , representing a list of elements.
        // 90% of the time you will be using one dimensional array

        int [] ages = {34,54,56,32,32};// this is how we initialize a 1D array
        int [] ages1 = new int[6];

        // multi-dimensional array
        // have two or more dimension , reprresenting a  table or grid of elements.
        // AT - 2D , 3D - only used/comes in coding questions.

        //  2-D Array
        int [][] array_2d = new int[3][3];
        //  00 01 02
        //  10 11 12
        //  20 21 22

        array_2d [0][1] = 01;
  //  [this is how a 3*3 2d array will look like, and the number shows the position of each element]

        // take note that [i][j]
        // 1st element [i] represent the -> row
        // 2nd element [j] represent the -> column

    }
}
