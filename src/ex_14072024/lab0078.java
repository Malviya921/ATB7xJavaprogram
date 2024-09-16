package ex_14072024;

public class lab0078 {
    public static void main(String[] args) {
        String password = "Prince@123";
        String pass_u = password.toLowerCase();
        System.out.println(pass_u);
        // pass_u == password no so (false) so how to check that

        System.out.println(pass_u==password);  //false
        System.out.println(pass_u.equals(password));   //false
        System.out.println(pass_u.equalsIgnoreCase(password)); // now true
        // Prince@123 == prince@123 = PRince@123 ....
        // if there is a space we need to use trim otherwise not match

        System.out.println(password.substring(0,3)); //it will give 0,1,2 not 3 (excluded)
        System.out.println(password.indexOf('r'));
        System.out.println(password.length());











    }
}
