package ex_27072024;

public class lab142 {
    public static void main(String[] args) {
        final int [] ages = new int [4]; // here final is for length, also in case of non permitive array
        // we still can not change the value of length so it does't matter to use finel here
        ages[3] = 78;
        System.out.println(ages[3]);

        final int a = 10; // here final work as intended
        // a = 90;
        // we can not change the value here final is fixing the value of a single element

        // final is nothing but an alternate name of constant in java
        // so final and constant are almost similar



    }
}
