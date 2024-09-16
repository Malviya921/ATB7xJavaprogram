package ex_20072024;

public class lab0086a {
    public static void main(String[] args) {
        boolean a = true;
        a = !a;
        if (2+2 < 4){
            System.out.println("inside the loop");// up untilll here things are in the loo[
        }
        System.out.println("outside the loop, but will always be executed ->"+a); // outsid the loop



    }
}
// here the output will be -> outside the loop, but will always be executed
// bcoz the expression 2+2<4 is false so it will not go furthe into the condition
//will jump and directly go to the next