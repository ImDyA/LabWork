package module2.lab2_2_0;

import java.util.Scanner;

public class Accountant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee use = new Employee();
        String user = scan.nextLine();
        double salary = scan.nextDouble();
        System.out.println(use.calcSalary(user));
        System.out.println(use.varargs(salary));
    }
}
