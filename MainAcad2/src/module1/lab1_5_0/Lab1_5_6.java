package module1.lab1_5_0;

import java.util.Scanner;

public class Lab1_5_6 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int number = scann.nextInt();
        int number2 = scann.nextInt();
        int number3 = scann.nextInt();

        int i = number * number;
        int b = number2 * number2;
        int a = number3 * number3;

        System.out.println("Number: " + number + number2 + number3);
        System.out.println("Sum of squares of digits of number: " + i + b + a);
    }
}
