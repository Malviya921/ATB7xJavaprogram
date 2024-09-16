package ex_14072024;

public class lab0067 {
    public static void main(String[] args) {
        String name = "PRINCE";

        // String? - // BUNCH OF CHARS or COLLECTION OF CHARS
        // class ?
//        String name2 = new String (original : "PRINCE");
        // HOW MANY WAYS = 2
        //1-> = ,2 -> New Oprerator
        // = "scp" (string constant pool)
        // NEW  - Objects(HEAP)

        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(4));
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(10));// EXCEPTION Index 10 out of bounds


    }
}
