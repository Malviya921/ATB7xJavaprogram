package ex_20072024;

public class lab0100 {
    public static void main(String[] args) {
        //JDK>13
        char code = 68;     // or      char code = 'A'
        int val = switch (code){
            case 65:        //or       case 'A':
                yield 65;   //or       yield 65
            case 66:
                yield 66;
            default:
                throw new IllegalStateException("Unexpected value: " + code);
        };
        System.out.println(val);
    }
} // in case of yield you dont need break
