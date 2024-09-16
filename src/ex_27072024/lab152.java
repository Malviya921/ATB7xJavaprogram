package ex_27072024;

public class lab152 {
    public static void main(String[] args) {
        // string -> immutable in nature
        // there are two more classes
        //1-> string builder
        //2-> string buffer

         String s1 = "ravi";// if we create a string name s1 -> ravi
        s1 = "saini"; // if we change the value of s1 to saini
        // now there are two strings in the string constant pool just tha the ravi reference is gone

        // but of we use string buffer
        StringBuffer stringBuffer = new StringBuffer("ravi");
        // and if we change the value of string buffer there will be only one string
        stringBuffer.append("saini");// THESE append will be done in sync one after another
        stringBuffer.append("JI");
        // note-> we need to use small s-> stringBuffer in order to append the string
        // if we use the capital S then it will take it as we want to crete a new string
        // will through an error with append

        StringBuilder stringBuilder = new StringBuilder("ravi");
        stringBuilder.append("saini");

        // here first one will be replaced by the garbage collector, and there will be only one string

        // the difference in both of them is thread safty
        // string builder id not sync. and is faster
        // string buffer id sync. and is slower due to sync.

        // we avoid the thread safty as much as we can even in automation due to slowess
        // so string builder is used mostly


    }
}
