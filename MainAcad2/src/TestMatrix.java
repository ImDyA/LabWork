public class TestMatrix {
    public static void main(String[] args) {
        int [] [] matrix = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3},

        };

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }

        int [][] result = new int[matrix[0].length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                result[i][j] = matrix[j][i];
            }
        }

        System.out.println("\n");

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < result[i].length; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
