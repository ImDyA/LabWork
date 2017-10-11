package module2.lab2_2_0;

public class Matrix {
    public int addition(int i, int b, int z, int x){
        int[][] arr1 = new int[10][10];
        int g = 0;
        for (int t = 0; t < arr1.length; t++){
            for (int u = 0; u < arr1.length; u++){
                g++;
                arr1[t][u] = g;
            }
        }
        int l1 = arr1[i][b] + arr1[z][x];
        return l1;
    }
    public int multiplication(int q, int w, int e, int r){
        int[][] arr2 = new int[10][10];
        int g = 0;
        for (int t = 0; t < arr2.length; t++){
            for (int u = 0; u < arr2.length; u++){
                g++;
                arr2[t][u] = g;
            }
        }
        int l2 = arr2[q][w] * arr2[e][r];
        return l2;
    }
}
