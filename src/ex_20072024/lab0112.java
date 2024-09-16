package ex_20072024;

public class lab0112 {
    public static void main(String[] args) {
        //final boolean b1 = true;
        // b1 = false; we can not change the values coz final this is fixed now
        //for (int i = 0; b1 ; i++) {
            System.out.println("hello");
            // infinite loop coz the value of b1 is always true in this case
            // OTHER INFINITE LOOP CONDITIONS

// if we do not put increment in the loop then it will be infinite loop

            //        for (int i = 0; ; ) no termination , no incre/decre  infinite loop

            //         for (; ; ) , no initialization , no termination , no incre/decre  infinite loop

//            for (float f = 0; f <10.67 ; f++) {
  //              System.out.println("hi, float "+f);}

            for (byte b = 0; b < 10.01 ; b++) {
                System.out.println("byte "+b);

            }

for (byte b = 0; b < 10.00 ; b++) {
                System.out.println("byte "+b);

            }

// NOTE in case of byte also it considered tyhe value 10<10.01 as true







        }
    }