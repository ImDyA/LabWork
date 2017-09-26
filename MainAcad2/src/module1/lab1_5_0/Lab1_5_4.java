package module1.lab1_5_0;

import java.util.Scanner;

public class Lab1_5_4 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int number = scan.nextInt();

        for (int i = 1; i < 3000; i++) {
            if (i>number) {
                break;
            } else if (i % 3 == 0 || i % 4 == 0){
                System.out.println(i);
            }
        }
    }
}


/*
for (int i = 1; i < 3000; i++) {
    if (i>=20) {
        break;
    } else if (i % 3 == 0 || i % 4 == 0){
        System.out.println(i);
    }
}

for (int i = 1; i < 3000; i++) {
    if (i % 3 == 0 || i % 4 == 0) {
        System.out.println(i);
           } else if (i>=20){
                break;
           }
}
 */