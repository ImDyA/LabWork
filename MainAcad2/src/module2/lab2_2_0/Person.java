package module2.lab2_2_0;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private int phoneNumber;

    public void user(String firstName, String lastName, String gender){
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(gender);
    }
    public void user(int age, int phoneNumber){
        System.out.println(age);
        System.out.println(phoneNumber);
    }
}

