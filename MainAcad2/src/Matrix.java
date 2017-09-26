public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };

        int[][] matrix2 = {{1}, {2}, {3}};


        if (matrix[0].length == matrix2.length){
            System.out.println("Good");
            int[][] result = new int[matrix.length][matrix2[0].length];
            for (int i = 0; i<matrix.length; i++){
                for (int j = 0; j<matrix2[0].length; j++){
                    System.out.println();
                }
                System.out.println();
            }
        } else {
            System.out.println("Error");
        }

    }
}