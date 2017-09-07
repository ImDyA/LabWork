package module1.lab1_5_0;

import java.util.Scanner;

public class Lab1_5_2 {
    public static void main(String[] args) {
        String b;
        Scanner wat = new Scanner(System.in);
        int q = wat.nextInt();
        switch (q){
            case 1: b ="one";
            break;
            case 2: b = "two";
            break;
            case 3: b = "three";
                break;
            case 4: b = "four";
                break;
            case 5: b = "five";
                break;
            case 12: b = "twelve";
                break;
            default:b = "Other";
            break;
        }
        System.out.println(b);

        int r;
        Scanner w = new Scanner(System.in);
        r = w.nextInt();

        if (r > 0 && r < 12) {
            System.out.println("green");
        } else {
            System.out.println("other");
        }
    }
}
