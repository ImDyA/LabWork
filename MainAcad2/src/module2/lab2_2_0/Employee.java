package module2.lab2_2_0;

public class Employee {
    public String calcSalary(String userName){
        String name = "User name: " + userName;
        return name;
    }
    public double varargs(double salary){
        int month = 12;
        double sum = month * salary;
        return sum;
    }
}
