package module1.lab1_6_0;

public class Lab1_6_3 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        int number = 0;
        for (int i = 0; i < arr.length; i++){
            for (int b = 0; b < arr.length; b++){
                number++;
                arr[i][b] = number;
                System.out.print(arr[i][b] + " ");
            }
            System.out.println();
        }
    }
}
