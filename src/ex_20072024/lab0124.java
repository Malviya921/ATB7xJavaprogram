package ex_20072024;

public class lab0124 {
    public static void main(String[] args) {
        for (int i = 0; i <= 50 ; i++) { // i = 0 to 50 -> 51 times
            if (i%2 == 0){
                System.out.println("even-> "+i);
                break;
                // break is not like continue break will terminate the whole program after 1st execution
            }
            System.out.println("odd-> " +i);

        }


    }
}
