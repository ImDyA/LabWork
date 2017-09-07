package module1.lab1_4_0;

public class Lab1_4_3 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        if (a==true|b==true){
            System.out.println(a);
        }

        if (a==true&b==true){
            System.out.println(a);
        }else {
            System.out.println("b not true");
        }

        if (a^b){
            System.out.println("a not b");
        }

        if (!a==b){
            System.out.println("a = false");
        }
    }
}
