package ex_27072024;

public class lab138 {
    public static void main(String[] args) {

        int[] marks_10_board = {90,89,87,67,77,33};
        // elements are fixed.
        // len -> 6
        // who index - 3 ->

        System.out.println(marks_10_board.length);
        System.out.println(marks_10_board[3]); //99
        System.out.println(marks_10_board[0]); //0
        System.out.println(marks_10_board[10]); // ArrayIndexOutOfBoundException
 //     System.out.println(marks_10_board[-10]);



    }
}
