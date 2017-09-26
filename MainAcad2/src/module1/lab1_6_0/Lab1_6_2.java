package module1.lab1_6_0;

public class Lab1_6_2 {
    public static void main(String[] args) {
        int min, max, average;
        int[] m = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };
        for (int b = 1; b < 100; b++){
            for (int i = 0; i < m.length; i++){
                if (m[i] == b){
                    System.out.println(m[i]);
                } else {
                    i++;
                }
            }
        }
    }
}
