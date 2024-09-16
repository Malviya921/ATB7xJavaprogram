package ex_20072024;

public class lab0097 {
    public static void main(String[] args) {
        // if you are using JDK > 13, then you can use multiple condition
        int itemcode = 001;
        switch (itemcode){
            case 001,002,003:
                System.out.println("it is an electronic device");
                break;
            case 004,005,006:
                    System.out.println("it is an electrical device");
                    break;
            default:
                System.out.println("i don't know what it is");
        }


    }
}
