package ex_20072024;

public class lab0085 {
    public static void main(String[] args) {
         boolean a = true;
         a = !a;
         if (2+2 >= 4){
             System.out.println("inside the loop");// up untilll here things are in the loo[
         }
        System.out.println("outside the loop, but will always be executed ->"+a); // outsid the loop



    }
}
// here boolean and the variable a has no relation with the if loop
// if loop ends at 1st print st.
// 2nd print st. belongs to the main method and not related to the if statement
// else part is always optional
// understand with debug -> checking the code line by line we execute the code line by line
//and check
// in debugging we can place the debug break points to check/know the details/values to know what is going on with this line no.
// SO IN the case of line no. 6 here the expression 2+2 >= 4 is true so the debug will directly go to the condition part
// which is -> print "inside the loop"
// but say if we have an expression 2+2 < 4 which is false then we will not go in the condition part and
// the outp[ut will be false we will not go in the condition
// we can remove the debug points after wards
// so there are 2 ways either run the whole program (which is compilation) or run line by line which is debugging format
// eX---

