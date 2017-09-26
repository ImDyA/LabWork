package module1.lab1_6_0;

public class Lab1_6_1 {
    public static void main(String[] args) {
        int i = 0;
        int[] arr = new int[15];
        for (int b = 0; b < 15; b++){
            i++;
            i++;
            arr[b] = i;
        }
        for (int a = 0; a < arr.length; a++){
            System.out.println(arr[a]);
        }
    }
}
