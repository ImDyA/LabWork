package module1.lab1_5_0;

import java.util.Scanner;

public class Lab1_5_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        for (int i = 0; i <= number; i++){
            if (i == 6){
                System.out.println("Perfect number:" + i);
            } else if (i == 28){
                System.out.println("Perfect number:" + i);
            } else if (i == 496){
                System.out.println("Perfect number:" + i);
            } else if (i == 8128){
                System.out.println("Perfect number:" + i);
            } else if (i == 33550336){
                System.out.println("Perfect number:" + i);
            }
        }
    }
}
