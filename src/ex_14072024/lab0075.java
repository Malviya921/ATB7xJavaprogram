package ex_14072024;

public class lab0075 {
    public static void main(String[] args) {
        String s1 = new String("PRINCE");
        String s2 = new String("PRINCE");
        String s3 = new String("PRINCE");

        System.out.println(s1==s2); // check for the reference ans will be false
//        System.out.println(s1==s2==s3); not possible coz its not a comparison
        System.out.println(s2==s3); // checks for the reference ans will be false
        System.out.println(s2.equals(s3)); //checks for the values ans will be true




    }
}
