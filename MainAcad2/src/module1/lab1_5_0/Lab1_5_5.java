package module1.lab1_5_0;

import java.util.Scanner;

public class Lab1_5_5 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        double number = scann.nextDouble();

        double n = number;
        double i = n*(n+1)/2;
        System.out.println("The Sum is: " + i);
        System.out.println("The Avg is: " + (i/n));
    }
}