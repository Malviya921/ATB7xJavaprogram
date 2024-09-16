package ex_27072024;

public class lab143 {
    public static void main(String[] args) {
        final float pi = 3.14f;


        // Disadvantage of array
        // 1. fixed data type (homo)
        // 2. fixed length. (As discussed in previous lab)
        // 3. wastage of memory
        int [] ages = new int[100]; // as we have assigned the 100 slot to this array
        // but have only assigned the value at a single slot so the rest will be empty and waste memory
        ages[1] = 99;
        ages[1] = 100; // we can re-assign the value at any index any no. of time we want.
        System.out.println(ages[1]); // 0 99 0000000...






    }
}
