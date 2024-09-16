package ex_27072024;

public class lab151 {
    public static void main(String[] args) {
        // string -> bunch of chars.
        // two ways to create a string
        // 1 -> by using an object -> stored in heap area
        // 2-> by assigning it directly -> stored in string constant pool

        String s1 = new String("ravi"); //stored in heap area
        String s2 = "ravi"; // stored in string constant pool

        // strings are immutable in nature (you can replace there is a function called replace)
        // and we have seen functions also like below
        System.out.println(s1.length());
        System.out.println(s1.indexOf("v"));
        System.out.println(s1.charAt(1));
        System.out.println(s1.toLowerCase());






    }
}
