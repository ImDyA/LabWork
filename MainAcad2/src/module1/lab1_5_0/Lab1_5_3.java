package module1.lab1_5_0;

public class Lab1_5_3 {
    public static void main(String[] args) {
        String x, y;
        x = "* | 1 2 3 4 5 6 7 8 9";
        y = "---------------------";
        int a, b, c;
        System.out.println(x);
        System.out.println(y);

        for (a=1;a<=10;a++){
            for (b=10;b>0;b--){
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
