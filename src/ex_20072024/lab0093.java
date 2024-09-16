package ex_20072024;

import java.util.Scanner;

public class lab0093 {
    public static void main(String[] args) {
         // web automation
        // i will ask the user which browser you want to run the code.
        // chrome  -> start the chrome , firefox-> firefoxx , edge -> execution edge

        Scanner sc = new Scanner(System.in);
        System.out.println("browser name");
        String browserName = sc.next();
        browserName = browserName.toLowerCase();

        switch (browserName){
            case "chrome":
                System.out.println("starting the chrome browser");
                break;
                case "firefox":
                System.out.println("starting the firefox browser");
                break;
                case "edge":
                System.out.println("starting the edge browser");
                break;
            default:
                System.out.println("i have no idea which browser is this");
                break;
        }

    }
}
