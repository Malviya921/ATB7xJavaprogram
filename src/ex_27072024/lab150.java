package ex_27072024;

public class lab150 {
    public static void main(String[] args) {

        int [][] array_2d = {
                {34,1},
                {35,2},
                {36,3},
        };
        for (int i = 0; i < array_2d.length ; i++) {
            for (int j = 0; j < array_2d[i].length ; j++) {
                System.out.print(array_2d[i][j]);
                System.out.print("\t");



            }
            System.out.println();

        }

    }
}
