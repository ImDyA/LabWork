package module2.lab2_4_0;

public class Lab2_4_6 {
    public static void main(String[] args) {
        String[] arr = new String[5];
        int[] arr2 = new int[5];

        for (int a = 0; a < arr.length; a++){
            arr[a] = " ";
        }

        for (int i = 0; i < arr.length; i++){
            for (int b = 0; b < arr.length; b++){
                int t = 4;
                if (b == t){
                    arr[b] = " 1";
                    t--;
                }else {
                    break;
                }
            }
        }
        System.out.print(arr[0]);
        System.out.print(arr[1]);
        System.out.print(arr[2]);
        System.out.print(arr[3]);
        System.out.print(arr[4]);
    }
}
