package ex_14072024;

public class lab0076 {
    public static void main(String[] args) {
        String s1 = "prince";
        //String s1 = "p r i n c e";
        //            /0/1/2/3/4/5/

        char c = s1.charAt(5);
        System.out.println(c);
        s1.concat("SAINI"); //concat but nost saved

        System.out.println(s1); // here the output will be prince coz concat fn. hasnt bee saved

        s1 = s1.concat("SAINI"); //now only it will give us prince saini








    }
}
