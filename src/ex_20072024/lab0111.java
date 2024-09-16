package ex_20072024;

public class lab0111 {
    public static void main(String[] args) {
        for (int i = 0; ;i++) { // we can not write like  for (int i = 0; i++)
            // we need to give blank space for the exit condition even if it is not there
            System.out.println(i);
        }
    }
}
// here no exit codition defined so we will get infinite loop