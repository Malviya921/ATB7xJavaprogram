package ex_20072024;

public class lab0123 {
    public static void main(String[] args) {
        for (int i = 0; i <= 50 ; i++) { // i = 0 to 50 -> 51 times
            if (i%2 == 0){
                System.out.println("even-> "+i);
                continue;
            }
            System.out.println("odd-> " +i);

        }
    }
}
