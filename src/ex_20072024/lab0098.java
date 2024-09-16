package ex_20072024;

public class lab0098 {
    public static void main(String[] args) {
        // if you are using JDK > 13, then you can use
        // arrow ->  in place of : and then ypu don't need to use BREAK in the end
        int itemcode = 001;
        switch (itemcode){
            case  001,002,003 -> System.out.println("it is an electronic device");
            case 004,005,006 -> System.out.println("it is an electrical device");
            default -> System.out.println("i don't know what it is");
        }


    }
}
