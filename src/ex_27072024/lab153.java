package ex_27072024;

public class lab153 {
    public static void main(String[] args) {
        // why we use string builder here is an example
        // there are many function like here we used reverse function an reversed the string to the original or previous value (not clear read)

        StringBuilder stringBuilder = new StringBuilder("ravi");
        System.out.println(stringBuilder.reverse().toString());
    }
}
